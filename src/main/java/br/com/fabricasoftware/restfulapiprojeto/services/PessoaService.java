package br.com.fabricasoftware.restfulapiprojeto.services;

import br.com.fabricasoftware.restfulapiprojeto.controlers.dto.pessoa.PessoaFormDto;
import br.com.fabricasoftware.restfulapiprojeto.exceptions.RegraDeNegocioException;
import br.com.fabricasoftware.restfulapiprojeto.models.Pessoa;
import br.com.fabricasoftware.restfulapiprojeto.repositories.PessoaRepository;
import br.com.fabricasoftware.restfulapiprojeto.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Long save(PessoaFormDto pessoaFormDto){
        Pessoa pessoaSave = new Pessoa(pessoaFormDto);


        if(usuarioRepository.existEmail(pessoaSave.getUsuario().getEmail(), pessoaSave.getUsuario().getId())){
            throw new RegraDeNegocioException("pessoa.EmailJaExiste");
        }

        return pessoaRepository.save(pessoaSave).getId();
    }
}
