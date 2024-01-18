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

        // Iniciando o processo
        process.start();

        // Tentando retomar o processo
        process.resume();

        // Suspender o processo
        process.suspend();

        // Finalizar o processo
        process.finish();

        // Tentando iniciar o processo novamente
        process.start();
    }
}
