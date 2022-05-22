package br.com.fabricasoftware.restfulapiprojeto.services;

import br.com.fabricasoftware.restfulapiprojeto.controlers.dto.usuario.UsuarioFormDto;
import br.com.fabricasoftware.restfulapiprojeto.models.Usuario;
import br.com.fabricasoftware.restfulapiprojeto.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Optional<Usuario> list(Long id){
        return usuarioRepository.findById(id);
    }

    public Long save(UsuarioFormDto usuarioFormDto){
        Usuario usuarioSave = new Usuario(usuarioFormDto);

        return usuarioRepository.save(usuarioSave).getId();
    }
}
