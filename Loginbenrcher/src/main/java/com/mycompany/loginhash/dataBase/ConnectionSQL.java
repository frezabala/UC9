/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginhash.dataBase;

import com.mysql.cj.xdevapi.Statement;
import io.github.cdimascio.dotenv.Dotenv;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author FRELIANNYSISMELIALOP
 */
public class ConnectionSQL {
    // Carrega as variáveis do arquivo .env
    //private static final Dotenv dotenv = Dotenv.load();
    private static final Dotenv dotenv = Dotenv.load();
        private static Connection connection;
        
        private static final String URL = dotenv.get("DB_URL");
        private static final String DB_USER = dotenv.get("DB_USER");
        private static final String DB_PASSWORD = dotenv.get("DB_PASSWORD");
       
        
        public static Connection conect(){
            try{
                if(connection == null || connection.isClosed()){
                    connection = DriverManager.getConnection(URL,DB_USER,DB_PASSWORD);
                    CrearteTable.createTable(connection);
                    System.out.println("successfully connected");
                }
            } catch(SQLException e){
                System.out.println("Error in database connection" +  e.getLocalizedMessage());
            }
            return connection;
        }
 
    }
    

