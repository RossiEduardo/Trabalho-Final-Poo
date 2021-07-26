package br.usp.poo.allpet.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import br.usp.poo.allpet.model.Usuario;
import br.usp.poo.allpet.repository.UsuarioRepository;

@Repository
public class ImplementsUserDetailsService implements UserDetailsService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Usuario usuario = usuarioRepository.findByEmail(email);
		
		if (usuario == null)
			throw new UsernameNotFoundException("Usuário não encontrado.");
		return usuario;
	}

}
