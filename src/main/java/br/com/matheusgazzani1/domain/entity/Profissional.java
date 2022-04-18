package br.com.matheusgazzani1.domain.entity;

public class Profissional {

    private Long ID_Profissional;
    private String cpf;
    private String nome;
    private String email;
    private String senha;
    private String endereco;
    private String telefone;

    public Profissional(Long ID_Profissional, String nome, String email, String senha, String endereco, String telefone) {
        this.ID_Profissional = ID_Profissional;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Long getID_profissional() {
        return ID_Profissional;
    }

    public void setID_profissional(Long ID_profissional) {
        this.ID_Profissional = ID_profissional;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
