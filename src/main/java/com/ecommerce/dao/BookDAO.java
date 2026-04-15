package com.ecommerce.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.ecommerce.utils.DBConnection;

public class BookDAO {

    public static void getAllBooks() {

        try {
            Connection con = DBConnection.getConnection();
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM books");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " "
                        + rs.getString("title") + " "
                        + rs.getString("author") + " "
                        + rs.getDouble("price") + " "
                        + rs.getInt("stock"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}