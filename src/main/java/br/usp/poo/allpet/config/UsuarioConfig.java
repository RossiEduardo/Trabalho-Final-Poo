package br.usp.poo.allpet.config;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.usp.poo.allpet.model.Usuario;
import br.usp.poo.allpet.repository.UsuarioRepository;

@Configuration
public class UsuarioConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(UsuarioRepository usuarioRepository) {
		return args -> {
			Usuario usuario1 = new Usuario(null, "Lucas Almeida");
			Usuario usuario2 = new Usuario(null, "Adrio Oliveira");
			
			usuarioRepository.saveAll(List.of(usuario1, usuario2));
		};
	}
	
}
