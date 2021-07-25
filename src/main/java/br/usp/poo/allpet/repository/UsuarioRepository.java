package br.usp.poo.allpet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usp.poo.allpet.model.Usuario;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UsuarioRepository extends JpaRepository<Usuario, Short> {

    @Query("SELECT u FROM Usuario u WHERE u.email= :email")
    Usuario findByEmail(@Param("email") String email);

}
