package com.example.demojavaweb31.dals;

import com.example.demojavaweb31.models.Product;

import java.util.ArrayList;

public class DalProduct extends DB {
    public ArrayList<Product> getList() {
        ArrayList<Product> products = new ArrayList<Product>();
        try {
            String sql = "SELECT * FROM products";
            var statement = this.connection.createStatement();
            var resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                String picture = resultSet.getString("picture");
                Product product = new Product(id, name, price, picture);
                products.add(product);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return products;
    }
}
