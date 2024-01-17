package br.edu.ifpi;

import java.sql.Connection;

import br.edu.ifpi.dao.DatabaseConnection;
import br.edu.ifpi.dao.ProductDao;
import br.edu.ifpi.entitie.Product;

public class Main {
    public static void main(String[] args) {

        // Trabalho demonstratvo sobre Design Patterns, apresentado na disciplina de
        // Programação Orientada a Objetos, ministrada pelo professor Jesiel Viana, no
        // curso de Análise e Desenvolvimento de Sistemas, no Instituto Federal do Piauí.

        // O trabalho apresenta o padrão de projeto Adapter, que é um padrão estrutural
        // que permite que objetos com interfaces incompatíveis trabalhem em conjunto.
        // O padrão Adapter atua como uma camada intermediária entre duas classes,
        // servindo como um tradutor entre classes. O padrão Adapter é muito útil quando
        // se deseja reaproveitar uma classe já existente, mas que não possui a interface
        // desejada. Neste exemplo, o padrão Adapter foi utilizado para adaptar o retorno
        // do ResultSet para uma lista de produtos. 
        
        // Ele foi utilizado na classe ProductAdapter, que possui um método estático que 
        // recebe um ResultSet e retorna uma lista de produtos. Assim, convertendo o 
        // ResultSet para uma lista de produtos, que é a interface desejada.

        // O contexto utilizado para demonstrar o padrão Adapter foi um sistema de
        // gerenciamento de produtos, onde é possível inserir, atualizar, deletar e
        // buscar produtos no banco de dados. Para isso, foi utilizado o padrão DAO
        // (Data Access Object), que é um padrão de projeto que permite separar as
        // regras de negócio das regras de acesso a banco de dados.

        // ========== CONEXÃO COM O BANCO DE DADOS ==========

        Connection connection = DatabaseConnection.getConnection();

        // ========== INSTANCIANDO O DAO DE PRODUTOS ==========

        ProductDao productDao = new ProductDao(connection);

        // ========== INSERINDO PRODUTOS ==========
        Product product = new Product("Product 2", "Description 2", 5.0, 20);
        productDao.insert(product);

        // ========== ATUALIZANDO PRODUTOS ==========
        // Product product = new Product(1, "Product 1 atualizado", "Description 1", 10.0, 5);
        // productDao.update(product);

        // ========== DELETANDO PRODUTOS ==========
        // Product product = new Product(1, "Product 1", "Description 1", 10.0, 5);
        // productDao.delete(product);

        // ========== BUSCANDO PRODUTOS ==========
        // Product product = productDao.select(2);
        // System.out.println("Nome: " + product.getName());
        // System.out.println("Descrição: " + product.getDescription());
        // System.out.println("Preço: " + product.getPrice());
        // System.out.println("Quantidade: " + product.getQuantity());

        // ---------- SAÍDA ----------
        // Nome: Product 1
        // Descrição: Description 1
        // Preço: 10.0
        // Quantidade: 10

        // ========== BUSCANDO TODOS OS PRODUTOS ==========
        // for (Product product : productDao.selectAll()) {
        //     System.out.println("Nome: " + product.getName());
        //     System.out.println("Descrição: " + product.getDescription());
        //     System.out.println("Preço: " + product.getPrice());
        //     System.out.println("Quantidade: " + product.getQuantity());
        //     System.out.println();
        // }

        // ---------- SAÍDA ----------
        // Nome: Product 1
        // Descrição: Description 1
        // Preço: 10.0
        // Quantidade: 10

        // Nome: Product 2
        // Descrição: Description 2
        // Preço: 5.0
        // Quantidade: 20
    }
}