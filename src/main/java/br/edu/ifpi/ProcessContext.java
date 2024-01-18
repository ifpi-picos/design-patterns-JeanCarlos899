package br.edu.ifpi;

// Classe de contexto (Contexto do Processo) que mantém uma referência para o estado atual
public class ProcessContext {
    private ProcessState currentState;

    public ProcessContext() {
        // Definindo o estado inicial como "Pronto"
        this.currentState = new ReadyState();
    }

    public void start() {
        currentState.start(this);
    }

    public void suspend() {
        currentState.suspend(this);
    }

    public void resume() {
        currentState.resume(this);
    }

    public void finish() {
        currentState.finish(this);
    }

    public void setState(ProcessState state) {
        System.out.println("Alterando o estado do processo.");
        this.currentState = state;
    }
}
