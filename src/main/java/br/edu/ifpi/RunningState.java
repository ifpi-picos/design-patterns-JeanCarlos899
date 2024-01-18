package br.edu.ifpi;

public class RunningState implements ProcessState {
    @Override
    public void start(ProcessContext context) {
        System.out.println("Start: O processo já está em execução, não é possível iniciá-lo novamente.");
    }

    @Override
    public void suspend(ProcessContext context) {
        System.out.println("Suspend: Suspender a execução do processo, pois ele está em execução.");
        context.setState(new ReadyState());
    }

    @Override
    public void resume(ProcessContext context) {
        System.out.println("Resume: O processo já está em execução, não é possível retomá-lo.");
    }

    @Override
    public void finish(ProcessContext context) {
        System.out.println("Finish: Finalizando a execução do processo, pois ele está em execução.");
        context.setState(new FinishedState());
    }
}