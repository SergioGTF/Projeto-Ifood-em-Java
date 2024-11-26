/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author sergi
 */
public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/projeto_java";
    private static final String USER = "root";
    private static final String PASSWORD = "Paysandu_2077@";

    public static Connection getConnection() {
        try {
            // Estabelecendo a conexão com o banco
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            // Lança exceção em caso de erro
            throw new RuntimeException("Erro ao conectar ao banco de dados: " + e.getMessage(), e);
        }
    }
}
