package br.usp.poo.allpet.config;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.usp.poo.allpet.enums.Animal;
import br.usp.poo.allpet.model.Anuncio;
import br.usp.poo.allpet.model.Usuario;
import br.usp.poo.allpet.repository.AnuncioRepository;
import br.usp.poo.allpet.repository.UsuarioRepository;

@Configuration
public class RunnerConfig {
	
	// Esta classe serve para iniciar as tabelas quando o programa é executado
	
	//Criando usuários
	@Bean
	CommandLineRunner commandLineRunner(UsuarioRepository usuarioRepository, AnuncioRepository anuncioRepository) {
		return args -> {
			Usuario usuario1 = new Usuario(
					null, // Id (auto gerado)
					"Lucas Almeida", // Nome
					"Mogi das Cruzes", // Cidade
					"98765432100", // CPF
					"+5511926104254", // Telefone
					"lucasf.almeida@usp.br", // E-mail
					"$2a$10$gBFN.fLsEJUslH6ILQ9pJuvMWVgwjN.uNpqkHBrjO/Hx.SzPM1Z8." // Senha
				);
			Usuario usuario2 = new Usuario(
					null,
					"Adrio Oliveira",
					"São Carlos",
					"12345678910",
					"+551144513245",
					"adrio.oliveira@usp.br",
					"$2a$10$/tvGxvYQ19l0eRppVwFjzuARNLpKOl4vmxTGvzKkIU5fftpyooGna"
				);
			usuarioRepository.saveAll(List.of(usuario1, usuario2)); //Salvando no Banco de Dados
			
			//Criando anúncios 
			Anuncio anuncio = new Anuncio(
					null,
					"Cachorro vira-lata caramelo",
					"É um cachorro da vizinhança",
					"Avenida São Carlos",
					"São Carlos",
					"164565161",
					"lucasf.almeida@usp.br",
					Animal.CACHORRO,
					(short) 1
			);

			Anuncio anuncio2 = new Anuncio(
					null,
					"Garfield",
					"É um gato camarada",
					"Avenida São Carlos",
					"São Carlos",
					"164565161",
					"lucasf.almeida@usp.br",
					Animal.GATO,
					(short) 2
			);
			
			anuncioRepository.saveAll(List.of(anuncio, anuncio2)); //Salvando no Banco de Dados
		};
	}
	
}
