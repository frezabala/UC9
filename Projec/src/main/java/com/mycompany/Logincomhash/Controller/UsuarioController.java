/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Logincomhash.Controller;

import com.mycompany.Logincomhash.dao.UsuarioDAO;
import com.mycompany.Logincomhash.model.Usuario;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FRELIANNYSISMELIALOP
 */
public class UsuarioController {
     public static UsuarioDAO usuarioDAO = new UsuarioDAO();
    public static boolean regitrarUsuario(String email, char[] charSenha){
       String senha = new String(charSenha); 
       Usuario usuario = new Usuario(email, senha);
      
       
      return usuarioDAO.registrarUsuario(usuario);
    
    }
    
    
    public static Usuario verificarusuario(String email , char[] charSenha){
        String senha = new String(charSenha);
        Usuario usuario = new Usuario(email, senha);
     
        
        if(usuarioDAO.validarLogin(usuario)){
        return usuario;

        }else{
        return null;
        
        }
        
        
    
    
    }
    
     public static Usuario buscarUsuarioPorEmail(String email){
     return usuarioDAO.buscarUsuarioPorEmail(email);
     
     }
     
     
    public static ArrayList<Usuario> listarUsuarios( DefaultTableModel model){
       ArrayList<Usuario> usuarios = usuarioDAO.listarUsuarios();
       model.setColumnCount(0);
       for (Usuario user : usuarios){
       model.addRow(new Object[]{ user.getId(), user.getEmail()});
       }
         return null;
    }
    
    
}
