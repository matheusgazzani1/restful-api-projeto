package br.com.fabricasoftware.restfulapiprojeto.controlers;

import br.com.fabricasoftware.restfulapiprojeto.controlers.dto.pessoa.PessoaFormDto;
import br.com.fabricasoftware.restfulapiprojeto.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping
    public ResponseEntity<Long> salvar(@RequestBody  PessoaFormDto pessoaFormDto){
        return ResponseEntity.ok(pessoaService.save(pessoaFormDto));
    }
}
