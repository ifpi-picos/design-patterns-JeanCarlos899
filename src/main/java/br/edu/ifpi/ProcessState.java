package br.edu.ifpi;

// Interface para os estados do processo
public interface ProcessState {
    void start();

    void suspend();

    void resume();

    void finish();
}