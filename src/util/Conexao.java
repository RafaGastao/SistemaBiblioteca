/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author RafaelG
 */
public class Conexao {
    public static Connection conectar() {

        try {

            String url = "jdbc:mysql://localhost:3306/biblioteca";
            String usuario = "root";
            String senha = "";

            Connection conn = DriverManager.getConnection(url, usuario, senha);

            return conn;

        } catch (Exception e) {

            System.out.println("Erro na conexão: " + e);

            return null;

        }

    }
    
}
