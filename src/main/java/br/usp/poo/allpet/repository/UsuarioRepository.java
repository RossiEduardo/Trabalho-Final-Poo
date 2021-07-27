package br.usp.poo.allpet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.usp.poo.allpet.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Short> {
	
	//filtra os usuário por email
    @Query("SELECT u FROM Usuario u WHERE u.email= :email")
    Usuario findByEmail(@Param("email") String email);

}
