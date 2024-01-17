package br.edu.ifpi.dao;

import java.util.List;

import br.edu.ifpi.adapter.ProductAdapter;
import br.edu.ifpi.entitie.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDao implements Dao<Product> {
    private final Connection connection;

    public ProductDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public int insert(Product t) {
        final String sql = "INSERT INTO product (name, description, price, quantity) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, t.getName());
            statement.setString(2, t.getDescription());
            statement.setDouble(3, t.getPrice());
            statement.setInt(4, t.getQuantity());
            return statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int update(Product t) {
        final String sql = "UPDATE product SET name = ?, description = ?, price = ?, quantity = ? WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, t.getName());
            preparedStatement.setString(2, t.getDescription());
            preparedStatement.setDouble(3, t.getPrice());
            preparedStatement.setInt(4, t.getQuantity());
            preparedStatement.setInt(5, t.getId());
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int delete(Product t) {
        final String sql = "DELETE FROM product WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, t.getId());
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public Product select(int id) {
        final String sql = "SELECT * FROM product WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            // Usando o adapter para converter o ResultSet em um Produto
            return ProductAdapter.fromResultSet(resultSet).get(0);

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Product> selectAll() {
        final String sql = "SELECT * FROM product";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            // Usando o adapter para converter o ResultSet em uma lista de Produtos
            return ProductAdapter.fromResultSet(resultSet);

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}