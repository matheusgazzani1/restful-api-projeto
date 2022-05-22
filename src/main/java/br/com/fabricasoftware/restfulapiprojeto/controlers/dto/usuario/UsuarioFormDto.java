package br.com.fabricasoftware.restfulapiprojeto.controlers.dto.usuario;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
@NoArgsConstructor
public class UsuarioFormDto {

    private Long id;

    private String email;

    private String senha;
}
