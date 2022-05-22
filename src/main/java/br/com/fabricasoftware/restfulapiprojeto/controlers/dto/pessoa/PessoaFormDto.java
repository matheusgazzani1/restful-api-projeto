package br.com.fabricasoftware.restfulapiprojeto.controlers.dto.pessoa;

import br.com.fabricasoftware.restfulapiprojeto.controlers.dto.usuario.UsuarioFormDto;
import br.com.fabricasoftware.restfulapiprojeto.models.Usuario;
import br.com.fabricasoftware.restfulapiprojeto.util.pessoa.TipoPerfilEnum;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
public class PessoaFormDto {

    private Long id;

    private String endereco;

    private String telefone;

    private String celular;

    private UsuarioFormDto usuario;

}
