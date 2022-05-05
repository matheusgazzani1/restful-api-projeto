package br.com.fabricasoftware.restfulapiprojeto.repositories;

import br.com.fabricasoftware.restfulapiprojeto.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
