package com.company;

import javax.swing.*;
import java.sql.*;

public class Database {

    public static void main(String[] args){
        Connection conn = null;
        String user = "test";
        JPasswordField passwordField = new JPasswordField();
        JOptionPane.showConfirmDialog(null, passwordField, "password?", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        String password = new String(passwordField.getPassword());

        try {

            conn = DriverManager.getConnection();


        } catch (SQLException e) {
            e.printStackTrace();
        };


        try {
            Statement stmt = conn.createStatement();
            String SQLQuery = "SELECT * FROM ---";
            ResultSet rs = stmt.executeQuery(SQLQuery);

            ResultSetMetaData metaData = rs.getMetaData();

            int numCols = metaData.getColumnCount();
            for (int i = 1 ; i <= numCols ; i++) {
                System.out.println(metaData.getColumnClassName(i));
            }

            while (rs.next()) {
                String output = "";
                output += rs.getInt("id"); // + "," +
                //        rs.getString("title") + "," +
                //        rs.getString("author") + "," +
                //        rs.getDouble("price") + "," +
                //        rs.getInt("quantity");
                System.out.println(output);
            }

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
