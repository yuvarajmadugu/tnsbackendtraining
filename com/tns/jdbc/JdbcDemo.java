package com.tns.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo {
    public static void main(String[] args) {
        // Step 1: Database connection info
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "Postgreacc@09";

        try {
            // Step 2: Load PostgreSQL driver
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver loaded successfully!");

            // Step 3: Connect to the DB
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to PostgreSQL!");

            // Step 4: Create Statement
            String sql = "SELECT * FROM students";
            Statement stmt = conn.createStatement();

            // Step 5: Execute Query
            ResultSet rs = stmt.executeQuery(sql);

            // Step 6: Process Results
            while (rs.next()) {
                int id = rs.getInt("sid");
                String name = rs.getString("sname");
                System.out.println(id + " | " + name);
            }

            // Step 7: Close Connections
            rs.close();
            stmt.close();
            conn.close();
            System.out.println("Connection closed!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
