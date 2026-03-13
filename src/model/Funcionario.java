/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author RafaelG
 */
public class Funcionario extends Usuario{
    private int rgm;

    public Funcionario(String nome, String matricula, String endereco,
                       TipoUsuario tipoUsuario, int rgm) {

        super(nome, matricula, endereco, tipoUsuario);
        this.rgm = rgm;
    }

    public int getRgm() {
        return rgm;
    }
    
}
