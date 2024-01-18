package br.edu.ifpi;

// Interface para os estados do processo
public interface ProcessState {
    void start(ProcessContext context);

    void suspend(ProcessContext context);

    void resume(ProcessContext context);

    void finish(ProcessContext context);
}
