package model;

public class Usuario {

    private String nome;
    private String matricula;
    private String endereco;
    private TipoUsuario tipoUsuario;

    
    public Usuario() {
    }

   
    public Usuario(String nome, String matricula, String endereco, TipoUsuario tipoUsuario) {
        this.nome = nome;
        this.matricula = matricula;
        this.endereco = endereco;
        this.tipoUsuario = tipoUsuario;
    }

    // ✅ getters
    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getEndereco() {
        return endereco;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}