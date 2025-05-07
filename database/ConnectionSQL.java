/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cepcomApi.database;

import io.github.cdimascio.dotenv.Dotenv;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author FRELIANNYSISMELIALOP
 */
public class ConnectionSQL {
  
    private static final Dotenv dotenv = Dotenv.load();

    private static Connection connection;

    // Variáveis de conexão
    private static final String URL = dotenv.get("DB_URL");
    private static final String DB_USER = dotenv.get("DB_USER");
    private static final String DB_PASSWORD = dotenv.get("DB_PASSWORD");

    // Conecta ao banco de dados
    public static Connection connect(){
     try{ 
       
         if(connection == null  ||  connection.isClosed());{
         connection = (Connection) DriverManager.getConnection(URL , DB_USER, DB_PASSWORD);
                CriarTabela.criarTabela(connection);
                System.out.println("Conectado ao banco.");
     }

     }catch(SQLException error){
     throw new RuntimeException("Error na connecao" + error.getMessage());
     }
     return connection;
    }
       
     
           
}
