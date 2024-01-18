package br.edu.ifpi;

public class RunningState implements ProcessState {
    @Override
    public void start(ProcessContext context) {
        System.out.println("=====================================================================");
        System.out.println("Start: O processo já está em execução, não é possível iniciá-lo novamente.");
        System.out.println("=====================================================================");
    }

    @Override
    public void suspend(ProcessContext context) {
        System.out.println("=====================================================================");
        System.out.println("Suspend: Suspender a execução do processo, pois ele está em execução.");
        System.out.println("=====================================================================");
        context.setState(new ReadyState());
    }

    @Override
    public void resume(ProcessContext context) {
        System.out.println("=====================================================================");
        System.out.println("Resume: O processo já está em execução, não é possível retomá-lo.");
        System.out.println("=====================================================================");
    }

    @Override
    public void finish(ProcessContext context) {
        System.out.println("=====================================================================");
        System.out.println("Finish: Finalizando a execução do processo, pois ele está em execução.");
        System.out.println("=====================================================================");
        context.setState(new FinishedState());
    }
}