/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.Date;

/**
 *
 * @author RafaelG
 */
public class Emprestimo {
     private Date dataRetirada;
    private Date dataDevolucaoEsperada;
    private Date dataDevolucaoReal;
    private String situacao;

    public Emprestimo(Date retirada, Date devolucaoEsperada) {
        this.dataRetirada = retirada;
        this.dataDevolucaoEsperada = devolucaoEsperada;
        this.situacao = "EMPRESTADO";
    }

    public void devolverLivro(Date dataDevolucao) {
        this.dataDevolucaoReal = dataDevolucao;
        this.situacao = "DEVOLVIDO";
    }

    public String verificarSituacao() {
        return situacao;
    }
    
}
