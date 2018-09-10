/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Vitor Henrique
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionDAO {
    private static final String url = "jdbc:mysql://localhost:3306/bd_registerpet";
    private static final String usuario = "root";
    private static final String senha= "";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(url, usuario,senha);
        } catch (SQLException ex) {
            throw new RuntimeException("Erro na conexão: ", ex);
        }
    }

}
