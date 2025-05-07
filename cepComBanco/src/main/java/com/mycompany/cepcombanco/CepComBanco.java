/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cepcombanco;

import com.mycompany.cepcombanco.database.ConnectionSQL;
import com.mycompany.cepcombanco.view.CadastroFrom;

/**
 *
 * @author FRELIANNYSISMELIALOP
 */
public class CepComBanco {

    public static void main(String[] args) {
            //new CadastroFrom().setVisible(true);
            ConnectionSQL.conect();

    }
}
