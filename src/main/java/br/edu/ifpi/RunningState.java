package br.edu.ifpi;

public class RunningState implements ProcessState {

    private ProcessContext context;

    public RunningState(ProcessContext context) {
        this.context = context;
    }

    @Override
    public void start() {
        System.out.println("Start: O processo já está em execução, não é possível iniciá-lo novamente.");
    }

    @Override
    public void suspend() {
        System.out.println("Suspend: Suspender a execução do processo, pois ele está em execução.");
        context.setState(new ReadyState(this.context));
    }

    @Override
    public void resume() {
        System.out.println("Resume: O processo já está em execução, não é possível retomá-lo.");
    }

    @Override
    public void finish() {
        System.out.println("Finish: Finalizando a execução do processo, pois ele está em execução.");
        context.setState(new FinishedState(this.context));
    }
}