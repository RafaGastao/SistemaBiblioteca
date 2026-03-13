/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author RafaelG
 */
public class Usuario {
    private String nome;
    private String matricula;
    private String endereco;
    private TipoUsuario tipoUsuario;

    public Usuario(String nome, String matricula, String endereco, TipoUsuario tipoUsuario) {

        this.nome = nome;
        this.matricula = matricula;
        this.endereco = endereco;
        this.tipoUsuario = tipoUsuario;

    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }
    
}
