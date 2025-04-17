/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bancodedados;

import java.sql.Connection;

/**
 *
 * @author FRELIANNYSISMELIALOP
 */
public class Bancodedados {

    public static void main(String[] args) {
      ConexaoSQLite conexaoSQLite = new ConexaoSQLite();
      Connection conexao = conexaoSQLite.conectar();
      
      CriarTabela.criarTabelaUsuarios(conexao);
      //InserirUsuario.inserirUsuario(conexao, "ana", "ana@gmail.com");
      //InserirUsuario.inserirUsuario(conexao, "fre", "fre@gmail.com") ;
      //InserirUsuario.inserirUsuario(conexao, "thaiz", "thaiz@gmail.com");
      //AtualizarUsuario.atualizarUsuario(conexao, 2, "Ana", "ana@gmail.com");
 
      //DeletarUsuario.deletarUsuario(conexao, 1);
      
     // System.out.println(ListarUsuario.listarUsuarios(conexao));
    }
}
