package com.example.demojavaweb31.dals;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
    protected Connection connection;

    public void connect() {
        System.out.println("Connected to DB");
        //connect to DB
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java31", "root", "koodinh@");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public DB() {
        this.connect();
    }
}
