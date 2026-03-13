/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.LivroDao;
import java.util.List;
import model.Livro;

/**
 *
 * @author RafaelG
 */
public class LivroController {
    
     LivroDao dao = new LivroDao();

    public void cadastrarLivro(String titulo, String autor, int quantidade) {

        Livro livro = new Livro();

        livro.setTitulo(titulo);
        livro.setAutor(autor);
        livro.setQuantidade(quantidade);

        dao.cadastrarLivro(livro);

    }

    public List<Livro> listarLivros() {
        return dao.listarLivros();
    }
}
