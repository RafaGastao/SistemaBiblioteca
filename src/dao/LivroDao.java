/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.Livro;
import util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RafaelG
 */
public class LivroDao {
    public void cadastrarLivro(Livro livro) {

        String sql = "INSERT INTO livros (titulo, autor, quantidade) VALUES (?, ?, ?)";

        try {

            Connection conn = Conexao.conectar();

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, livro.getTitulo());
            stmt.setString(2, livro.getAutor());
            stmt.setInt(3, livro.getQuantidade());

            stmt.execute();

            conn.close();

        } catch (Exception e) {

            System.out.println("Erro ao cadastrar livro: " + e);

        }

    }

    public List<Livro> listarLivros() {
         List<Livro> lista = new ArrayList<>();

    String sql = "SELECT * FROM livros";

    try {

        Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {

            Livro livro = new Livro();

            livro.setTitulo(rs.getString("titulo"));
            livro.setAutor(rs.getString("autor"));
            livro.setQuantidade(rs.getInt("quantidade"));

            lista.add(livro);

        }

        conn.close();

    } catch (Exception e) {
        System.out.println("Erro ao listar livros: " + e);
    }

    return lista;
    }
}

    

