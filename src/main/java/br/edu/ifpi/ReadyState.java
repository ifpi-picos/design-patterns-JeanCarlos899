package br.edu.ifpi;

public class ReadyState implements ProcessState {
    @Override
    public void start(ProcessContext context) {
        System.out.println("Start: Iniciando a execução do processo.");
        context.setState(new RunningState());
    }

    @Override
    public void suspend(ProcessContext context) {
        System.out.println("Suspend: Não é possível suspender um processo que não está em execução.");
    }

    @Override
    public void resume(ProcessContext context) {
        System.out.println("Resume: Não é possível retomar um processo que ainda não começou a execução.");
    }

    @Override
    public void finish(ProcessContext context) {
        System.out.println("Finish: Finalizando o processo sem execução.");
        context.setState(new FinishedState());
    }
}