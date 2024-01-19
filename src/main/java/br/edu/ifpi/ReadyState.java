package br.edu.ifpi;

public class ReadyState implements ProcessState {

    private ProcessContext context;

    public ReadyState(ProcessContext context) {
        this.context = context;
    }

    @Override
    public void start() {
        System.out.println("Start: Iniciando a execução do processo.");
        context.setState(new RunningState(this.context));
    }

    @Override
    public void suspend() {
        System.out.println("Suspend: Não é possível suspender um processo que não está em execução.");
    }

    @Override
    public void resume() {
        System.out.println("Resume: Não é possível retomar um processo que ainda não começou a execução.");
    }

    @Override
    public void finish() {
        System.out.println("Finish: Finalizando o processo.");
        context.setState(new FinishedState(this.context));
    }
}