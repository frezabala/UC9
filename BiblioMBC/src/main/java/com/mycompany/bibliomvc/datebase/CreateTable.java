/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliomvc.datebase;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author FRELIANNYSISMELIALOP
 */
public class CreateTable {

    public static void createTables(Connection conexao) {
        String sql = "CREATE TABLE IF NOT EXISTS books("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "title VARCHAR(100) NOT NULL,"
                + "author VARCHAR (255) NOT NULL,"
                + "price REAL NOT NULL,"
                + "year INTERGET NOT NULL)";

        try (Statement stmt = conexao.createStatement()) {
            stmt.execute(sql);
            System.out.println("tables created");

        } catch (SQLException error) {
            System.out.println("Error " + error.getMessage());
        }

    }

}
