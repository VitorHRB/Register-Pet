/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.Connection;
import Model.Animal;
/**
 *
 * @author Vitor Henrique
 */

public class AnimalDAO {
    Connection conn;
    public AnimalDAO(){
        conn = ConnectionDAO.getConnection();
    }
    
    public void create(Animal a){
        try {
            PreparedStatement stmt= conn.prepareStatement("INSERT INTO animal(nome, animal, raca, dono, telefone, endereco, servico)"
                    + "VALUES(?,?,?,?,?,?,?);");
            stmt.setString(1, a.getNomeAnimal());
            stmt.setString(2, a.getAnimal());
            stmt.setString(3, a.getRaca());
            stmt.setString(4, a.getNomeDono());
            stmt.setString(5, a.getTelefone());
            stmt.setString(6, a.getEndereco());
            stmt.setString(7, a.getServico());
            stmt.executeUpdate();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar animal!");
            throw new RuntimeException(ex);
        }
    }
}
