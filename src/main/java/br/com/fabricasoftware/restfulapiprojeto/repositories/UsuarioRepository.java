package br.com.fabricasoftware.restfulapiprojeto.repositories;

import br.com.fabricasoftware.restfulapiprojeto.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query("SELECT DISTINCT CASE " +
            "WHEN COUNT(usuario) > 0 THEN true " +
            "ELSE false " +
            "END " +
            "FROM Usuario usuario " +
            "WHERE (usuario.email = :email) " +
            "AND (usuario.id <> :id OR :id IS NULL)")
    Boolean existEmail(@Param(value = "email") String email, @Param(value="id") Long id);

}
