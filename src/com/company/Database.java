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
        
    }
}
