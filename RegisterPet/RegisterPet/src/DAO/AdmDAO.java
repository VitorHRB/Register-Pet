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
import DAO.*;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Vitor Henrique
 */

public class AdmDAO {
    Connection conn;
    public AdmDAO(){
        conn = ConnectionDAO.getConnection();
    }
    public boolean LoginAdm(String email, String senha) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Connection conexao = null;
        boolean sucesso = false;
        String sql = "select * from administrador where email =? and senha=?";

        try {
            conexao = conn;
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, email);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            if (rs.next()) {
                sucesso = true;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL usuários: " + e);
        } finally {
            conexao.close();

        }

        return sucesso;
    }
    public boolean LoginUser(String email, String senha) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Connection conexao = null;
        boolean sucesso = false;
        String sql = "select * from cliente where email =? and senha=?";

        try {
            conexao = conn;
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, email);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            if (rs.next()) {
                sucesso = true;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL usuários: " + e);
        } finally {
            conexao.close();

        }

        return sucesso;
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
