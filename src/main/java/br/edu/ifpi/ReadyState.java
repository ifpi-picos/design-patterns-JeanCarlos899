package br.edu.ifpi;

public class ReadyState implements ProcessState {
    @Override
    public void start(ProcessContext context) {
        System.out.println("=====================================================================");
        System.out.println("Start: Iniciando a execução do processo.");
        System.out.println("=====================================================================");
        context.setState(new RunningState());
    }

    @Override
    public void suspend(ProcessContext context) {
        System.out.println("=====================================================================");
        System.out.println("Suspend: Não é possível suspender um processo que não está em execução.");
        System.out.println("=====================================================================");
    }

    @Override
    public void resume(ProcessContext context) {
        System.out.println("=====================================================================");
        System.out.println("Resume: Não é possível retomar um processo que ainda não começou a execução.");
        System.out.println("=====================================================================");
    }

    @Override
    public void finish(ProcessContext context) {
        System.out.println("=====================================================================");
        System.out.println("Finish: Finalizando o processo sem execução.");
        System.out.println("=====================================================================");
        context.setState(new FinishedState());
    }
}