/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.Connection;
import Model.Cliente;
/**
 *
 * @author Vitor Henrique
 */

public class ClienteDAO {
    Connection conn;
    public ClienteDAO(){
        conn = ConnectionDAO.getConnection();
    }
    
    public void create(Cliente c){
        try {
            PreparedStatement stmt= conn.prepareStatement("INSERT INTO cliente(nome,telefone, endereco, email)"
                    + "VALUES(?,?,?,?);");
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getTelefone());
            stmt.setString(3, c.getEndereco());
            stmt.setString(4, c.getEmail());
            stmt.executeUpdate();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar cliente!");
            throw new RuntimeException(ex);
        }
    }
}
