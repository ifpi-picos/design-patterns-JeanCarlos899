package br.edu.ifpi.adapter;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifpi.entitie.Product;

public class ProductAdapter {
    public static List<Product> fromResultSet(ResultSet resultSet) {
        try {
            List<Product> products = new ArrayList<>();

            while (resultSet.next()) {
                Product product = new Product(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("description"),
                        resultSet.getDouble("price"),
                        resultSet.getInt("quantity"));

                products.add(product);
            }

            return products;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
