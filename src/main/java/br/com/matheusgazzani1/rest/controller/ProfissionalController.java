package br.com.matheusgazzani1.rest.controller;

import br.com.matheusgazzani1.domain.entity.Profissional;
import br.com.matheusgazzani1.domain.repository.Profissionais;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class ProfissionalController {

    private Profissional profissionais;

    public ProfissionalController( Profissionais profissionais ) {
        this.profissionais = profissionais;
    }

    @GetMapping("{id}")
    public Profissional getProfissionalById(@PathVariable Integer id ){
        return profissionais
                .findById(id)
                .orElseThrow(() ->
                        new ResponseStatusException(HttpStatus.NOT_FOUND,
                                "Profissional não encontrado!") );
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Profissional save( @RequestBody Profissional profissional ){
        return profissionais.save(profissional);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete( @PathVariable Integer id ){
        profissionais.findById(id)
                .map( profissional -> {
                    profissionais.delete(profissional);
                    return profissional;
                })
                .orElseThrow(() ->
                        new ResponseStatusException(HttpStatus.NOT_FOUND,
                                "Profissional não encontrado!") );

    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update( @PathVariable Integer id,
                        @RequestBody Profissional profissional ){
        profissionais
                .findById(id)
                .map( profissionalExistente --> {
                        profissional.setId(profissionalExistente.getId());
        profissionais.save(profissional);
        return profissionalExistente;
        }).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Profissional não encontrado!") );

    }

    @GetMapping
    public List<Profissional> find(Profissional filtro ){
        ExampleMatcher matcher = ExampleMatcher
                .matching()
                .withIgnoreCase()
                .withStringMatcher(
                        ExampleMatcher.StringMatcher.CONTAINING );
        Example example = Example.of(filtro, matcher);
        return profissionais.findAll(example);
    }

}
