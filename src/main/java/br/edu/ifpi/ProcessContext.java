package br.edu.ifpi;

// Classe de contexto (Contexto do Processo) que mantém uma referência para o estado atual
public class ProcessContext {
    private ProcessState currentState;

    public ProcessContext() {
        // Definindo o estado inicial como "Pronto"
        this.currentState = new ReadyState(this);
    }

    public void start() {
        currentState.start();
    }

    public void suspend() {
        currentState.suspend();
    }

    public void resume() {
        currentState.resume();
    }

    public void finish() {
        currentState.finish();
    }

    public void setState(ProcessState state) {
        System.out.println("-alterando o estado do processo.");
        this.currentState = state;
    }
}
