/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.Logincomhash;

import com.mycompany.Logincomhash.databese.ConnectionSQL;
import com.mycompany.Logincomhash.viwn.Telalogin;
import com.mycompany.Logincomhash.viwn.telaListar;

/**
 *
 * @author FRELIANNYSISMELIALOP
 */
public class LoginComHash {

    public static void main(String[] args) {
        //Connect connect = new Connect();
       // Connect.conectar();
       
       new Telalogin().setVisible(true);
       new telaListar().setVisible(true);
       

    }
}
