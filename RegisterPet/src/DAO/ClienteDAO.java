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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Vitor Henrique
 */

public class ClienteDAO {
    Connection conn;
    public ClienteDAO(){
        conn = ConnectionDAO.getConnection();
    }
    public List<Cliente> buscar(String nome) throws Exception {

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Cliente> clientes = new ArrayList<>();

        try {
            stmt = conn.prepareStatement("SELECT * FROM cliente where nome like ?");
            stmt.setString(1, nome+"%");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Cliente cliente = new Cliente();
             
                cliente.setNome(rs.getString("nome"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setEmail(rs.getString("email"));
                clientes.add(cliente);
            }

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        } 
        
        return clientes;

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

    public void excluir(String nome, String nome0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
