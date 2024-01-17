package br.edu.ifpi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    // Atualizar as informações de conexão com o banco de dados
    private static final String URL = "";
    private static final String USER = "";
    private static final String PASSWORD = "";

    public static Connection getConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void closeConnection() {
        try {
            DriverManager.getConnection(URL, USER, PASSWORD).close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
