package br.edu.ifpi;

public class FinishedState implements ProcessState {
    @Override
    public void start(ProcessContext context) {
        System.out.println("=====================================================================");
        System.out.println("Start: O processo já foi concluído, não é possível iniciá-lo novamente.");
        System.out.println("=====================================================================");
    }

    @Override
    public void suspend(ProcessContext context) {
        System.out.println("=====================================================================");
        System.out.println("Suspend: Não é possível suspender um processo que já foi concluído.");
        System.out.println("=====================================================================");
    }

    @Override
    public void resume(ProcessContext context) {
        System.out.println("=====================================================================");
        System.out.println("Resume: Não é possível retomar um processo que já foi concluído.");
        System.out.println("=====================================================================");

    }

    @Override
    public void finish(ProcessContext context) {
        System.out.println("=====================================================================");
        System.out.println("Finish: O processo já foi concluído, não é possível finalizá-lo novamente.");
        System.out.println("=====================================================================");
    }
}