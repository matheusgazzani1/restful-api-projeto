package br.com.matheusgazzani1.domain.entity;

public class Cliente {

    private Long ID_Cliente;
    private String cpf;
    private String nome;
    private String email;
    private String senha;
    private String endereco;
    private String telefone;

    public Cliente(Long ID_Cliente, String nome, String email, String senha, String endereco, String telefone) {
        this.ID_Cliente = ID_Cliente;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Long getId_cliente() {
        return ID_Cliente;
    }

    public void setId_cliente(Long id_cliente) {
        this.ID_Cliente = id_cliente;
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
