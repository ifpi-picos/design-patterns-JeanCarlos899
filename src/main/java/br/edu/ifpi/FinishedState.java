package br.edu.ifpi;

public class FinishedState implements ProcessState {

    private ProcessContext context;

    public FinishedState(ProcessContext context) {
        this.context = context;
    }

    @Override
    public void start() {
        System.out.println("Start: O processo já foi concluído, não é possível iniciá-lo novamente.");
    }

    @Override
    public void suspend() {
        System.out.println("Suspend: Não é possível suspender um processo que já foi concluído.");
    }

    @Override
    public void resume() {
        System.out.println("Resume: Não é possível retomar um processo que já foi concluído.");

    }

    @Override
    public void finish() {
        System.out.println("Finish: O processo já foi concluído, não é possível finalizá-lo novamente.");
    }
}