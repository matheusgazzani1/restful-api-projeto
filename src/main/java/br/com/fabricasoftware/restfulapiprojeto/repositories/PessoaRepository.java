package br.com.fabricasoftware.restfulapiprojeto.repositories;

import br.com.fabricasoftware.restfulapiprojeto.models.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}