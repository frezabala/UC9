/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Exercicios;

import java.sql.Connection;

/**
 *
 * @author FRELIANNYSISMELIALOP
 */
public class Exercicios {

    public static void main(String[] args) {
     conexaoSQLite conexaoSQLite = new conexaoSQLite();
      Connection conexao = conexaoSQLite.conectar();
      
      CriarTabela.criarTabelaUsuarios(conexao);
    }
}
