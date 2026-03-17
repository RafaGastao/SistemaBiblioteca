package model;

import java.util.Date;

public class Emprestimo {

    private Date dataRetirada;
    private Date dataDevolucaoEsperada;
    private Date dataDevolucaoReal;
    private String situacao;
    private Usuario usuario;
    private Livro livro;

    
    public Emprestimo() {
    }

    
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

    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }

    public void setLivro(Livro livro){
        this.livro = livro;
    }

    
    public Usuario getUsuario(){
        return usuario;
    }

    public Livro getLivro(){
        return livro;
    }
}