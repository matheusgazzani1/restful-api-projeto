package br.com.fabricasoftware.restfulapiprojeto.models;

import br.com.fabricasoftware.restfulapiprojeto.controlers.dto.pessoa.PessoaFormDto;
import br.com.fabricasoftware.restfulapiprojeto.util.pessoa.TipoPerfilEnum;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "pessoa")
@NoArgsConstructor
public class Pessoa {

    @Id
    @Column(name = "id_pessoa")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private TipoPerfilEnum perfil;

    private String endereco;

    private String telefone;

    private String celular;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_id_usuario", foreignKey = @ForeignKey(name = "pessoa_usuario"))
    private Usuario usuario;

    public Pessoa(PessoaFormDto pessoa) {
        this.id = pessoa.getId();
        this.perfil = TipoPerfilEnum.USER;
        this.endereco = pessoa.getEndereco();
        this.telefone = pessoa.getTelefone();
        this.celular = pessoa.getCelular();
        this.usuario = new Usuario(pessoa.getUsuario());
    }
}
