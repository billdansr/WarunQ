/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.warunq.warunq;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Win10
 */
public class DatabaseConnection {
    
    public static Connection koneksi;
    
    public static Connection configure() throws SQLException {
        
        try {
            String user = "avnadmin";
            String password = "AVNS_dHcesTccniEeErK2qOH";
            String url = "jdbc:mysql://mysql-warunq-warunq.d.aivencloud.com:28737/db_warunq?sslmode=require";

            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            koneksi = DriverManager.getConnection(url, user, password);
            
            System.out.println("Database berhasil terhubung!");
        } catch (SQLException e) {
            System.err.println("Database gagal terhubung: " + e);
        }
        
        return koneksi;
    }
    
    public static void main(String[] args) throws SQLException {
//        Connection connection = (Connection)DatabaseConnection.configure();
    }
}
