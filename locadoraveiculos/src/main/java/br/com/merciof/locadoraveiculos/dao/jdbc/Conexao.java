/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.merciof.locadoraveiculos.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author merciof
 */
public class Conexao {
    
    private final String url = "jdbc:postgresql://localhost/estudodb";
    private final String user = "merciof";
    private final String password = "admin";
    
    /**
     * Connect to the PostgreSQL database
     *
     * @return a Connection object
     */
    public Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
 
        return conn;
    }
 
    public void closeConnection(Connection connection) {
        try {
            connection.close();
        } catch (SQLException ex) {
            System.out.println( "Erro ao fechar conexão com o bd: " + ex.getMessage());
        }
    }
 
}
