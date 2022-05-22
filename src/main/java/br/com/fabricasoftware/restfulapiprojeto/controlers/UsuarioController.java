package br.com.fabricasoftware.restfulapiprojeto.controlers;

import br.com.fabricasoftware.restfulapiprojeto.controlers.dto.usuario.UsuarioFormDto;
import br.com.fabricasoftware.restfulapiprojeto.models.Usuario;
import br.com.fabricasoftware.restfulapiprojeto.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Optional;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Usuario>> listar(@PathVariable(name = "id") Long id) throws IOException {
        return ResponseEntity.ok(usuarioService.list(id));
    }

    @PostMapping
    public ResponseEntity<Long> salvar(@RequestBody UsuarioFormDto usuario){
        return ResponseEntity.ok(usuarioService.save(usuario));
    }
}
