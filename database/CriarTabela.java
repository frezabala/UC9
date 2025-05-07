/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cepcomApi.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author FRELIANNYSISMELIALOP
 */
public class CriarTabela {
     public static void criarTabela(Connection connection) {
        String sql = "CREATE TABLE IF NOT EXISTS Endereco ("
                + "id INT AUTO_INCREMENT PRIMARY KEY, "
                + "rua VARCHAR(255) NOT NULL UNIQUE, "
                + "bairro VARCHAR(255) NOT NULL,"
                + "ciudade VARCHAR(255) NOT NULL,"
                + "estado VARCHAR(255) NOT NULL)";
        try (Statement stmt = connection.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao criar a tabela", e);
        }
    }
    
    
}
