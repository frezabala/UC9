/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginhash.Controller;

import com.mycompany.loginhash.UserDAO.UserDAO;
import com.mycompany.loginhash.model.User;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FRELIANNYSISMELIALOP
 */
public class userController {
    private static UserDAO userDAO = new UserDAO();
   public static boolean UserRegister(String email,char[] charPassword){
       
       String password = new String(charPassword);
       
       User user = new User(email,password);
       UserDAO usuarioDAO = new UserDAO();
       return usuarioDAO.registrarUsuario(user);
   }
   
   public static User verificarUsuario(String email, char[] charPassword){
       String password = new String(charPassword);
       User user = new User(email,password);
       if(userDAO.validarLogin(user) == true){
       
           return user;
       }else{
       
       }return null;
   }
   
   public static User buscarUsuarioPorEmail(String email){
       return userDAO.buscarUsuarioPorEmail(email);
   }
   
   public static void  buscarUsuarios(DefaultTableModel modelTable){
       ArrayList<User> user = userDAO.listarUsuarios();
       modelTable.setRowCount(0);
       
       for(User users : user){
           modelTable.addRow(new Object[] {users.getId() , users.getEmail()});
       }
   }
}
    

