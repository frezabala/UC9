/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliomvc.Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author FRELIANNYSISMELIALOP
 */
public class ConnectSQLite {

    public Connection connect() {
        Connection conexao = null; //
        String url = "jdbc:sqlite:libery.db";
        try {
            conexao = DriverManager.getConnection(url);
            System.out.println("conexao establecida");
        } catch (SQLException error) {
            System.out.println("Error: " + error.getMessage());
        }
        return conexao;
    }

    public void disconnection(Connection conexao) {
        if (conexao != null) {
            try {
                conexao.close();
                System.out.println("conexao encerrada");

            } catch (SQLException error) {
                System.out.println("Error " + error.getMessage());

            }
        } else {
            System.out.println("connect not fult");
        }

    }

}
