package br.com.fabricasoftware.restfulapiprojeto.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long ID;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;

    @Column(name = "apelido")
    private String apelido;


    @Column(name = "senha")
    private String senha;

    @Column(name = "confirm_senha")
    private String confirmSenha;
}
