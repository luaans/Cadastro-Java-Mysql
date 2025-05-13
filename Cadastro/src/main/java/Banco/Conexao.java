/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Aluno
 */
public class Conexao {
    public Connection Conexaobanco(){
 Connection conexao = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/cadastro", "root", "");
        } catch (ClassNotFoundException ex) {
            System.out.print(ex);
        } catch (SQLException ex) {
            System.out.print("Ocorreu um erro ao acessar o banco: " + ex.getMessage());
        }
         return conexao;
    }
    }

