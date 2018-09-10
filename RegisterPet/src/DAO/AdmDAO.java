/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.Connection;
import Model.Adm;
/**
 *
 * @author Vitor Henrique
 */

public class AdmDAO {
    Connection conn;
    public AdmDAO(){
        conn = ConnectionDAO.getConnection();
    }
    
    public void create(Adm m){
        try {
            PreparedStatement stmt= conn.prepareStatement("INSERT INTO administrador(nome,telefone, endereco, email, senha)"
                    + "VALUES(?,?,?,?,?);");
            stmt.setString(1, m.getNome());
            stmt.setString(2, m.getTelefone());
            stmt.setString(3, m.getEndereco());
            stmt.setString(4, m.getEmail());
            stmt.setString(5, m.getSenha());
            stmt.executeUpdate();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar cliente!");
            throw new RuntimeException(ex);
        }
    }
}
