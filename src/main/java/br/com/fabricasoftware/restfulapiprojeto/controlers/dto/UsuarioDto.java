package br.com.fabricasoftware.restfulapiprojeto.controlers.dto;

import lombok.Getter;

@Getter
public class UsuarioDto {

    private String nome;

    private String email;

    private String apelido;


    private String senha;

    private String confirmSenha;
}
