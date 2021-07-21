package br.usp.poo.allpet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usp.poo.allpet.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Short> {

}
