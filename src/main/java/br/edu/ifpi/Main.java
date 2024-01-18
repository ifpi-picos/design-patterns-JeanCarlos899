package br.edu.ifpi;

public class Main {
    public static void main(String[] args) {

        // Este código simples visa demonstrar o padrão de projeto State.
        // O padrão de projeto State é utilizado quando um objeto altera 
        // seu comportamento de acordo com o estado em que se encontra.

        // No exemplo abaixo, temos um processo que pode estar em 3 estados:
        // Pronto, Executando e Finalizado. Cada estado possui um comportamento
        // diferente para cada ação que pode ser executada no processo.

        // O padrão de projeto State é composto por 3 elementos:
        // - Contexto: Classe que mantém uma referência para o estado atual.
        // - Estado: Interface que define os métodos que serão implementados
        //   pelos estados concretos.
        // - Estados Concretos: Classes que implementam os métodos definidos

        // Criando um contexto de processo e interagindo com ele
        ProcessContext process = new ProcessContext();

        // ===================Iniciando o processo=========================
        // O estado inicial do processo é "Pronto", portanto, o método
        // "start" irá alterar o estado do processo para "Executando"
        process.start();

        // ====================Tentando retomar o processo=================
        // O estado atual do processo é "Executando", portanto, o método
        // "resume" não irá alterar o estado do processo, pois o mesmo
        // já está no estado "Executando"
        process.resume();

        // =======================Suspendendo o processo===================
        // O estado atual do processo é "Executando", portanto, o método
        // "suspend" irá alterar o estado do processo para "Pronto"
        process.suspend();

        // =======================Finalizando o processo===================
        // O estado atual do processo é "Pronto", portanto, o método
        // "finish" irá alterar o estado do processo para "Finalizado"
        process.finish();

        // ===============Tenando iniciar o processo novamente=============
        // O estado atual do processo é "Finalizado", portanto, o método
        // "start" não irá alterar o estado do processo, pois o mesmo
        // já está no estado "Finalizado"
        process.start();
    }
}
