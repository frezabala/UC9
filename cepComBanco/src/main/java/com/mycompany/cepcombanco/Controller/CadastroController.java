/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cepcombanco.Controller;

import com.mycompany.cepcombanco.Service.ViaCepService;
import com.mycompany.cepcombanco.database.ConnectionSQL;
import com.mycompany.cepcombanco.model.Endereco;
import com.mycompany.cepcombanco.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.json.JSONObject;

/**
 *
 * @author FRELIANNYSISMELIALOP
 */
public class CadastroController {
 
   
    // Busca o endereço pelo CEP e retorna um objeto Endereco ou null se houver erro
    public Endereco buscarEnderecoPorCep(String cep) throws Exception {
       
        JSONObject enderecoJson = ViaCepService.buscarCep(cep);
        

        // Verifica se a resposta contém a chave "erro" (CEP inválido)
        if (enderecoJson.has("erro")) {
            return null;
        }

        // Cria e retorna um objeto Endereco com os dados obtidos
        return new Endereco(
            enderecoJson.getString("logradouro"),
            enderecoJson.getString("bairro"),
            enderecoJson.getString("localidade"),
            enderecoJson.getString("uf")
        );
    }
      // Valida o formato do e-mail usando expressão regular (Regex)
    public boolean emailValido(String email) {
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        return email.matches(regex);
    }
    
    
    
    public static void registrarCEP(User user){
        String sql = "INSERT INTO tasks (cep , email) VALUES(?,?)";

        try (Connection conn = ConnectionSQL.conect()) { 
            PreparedStatement stmt = conn.prepareStatement(sql);
           stmt.setString(1, user.getEmail());
    
       
            

            
        } catch (SQLException error) {
            error.printStackTrace();
          
        }
    
    }
     
  
    
}
