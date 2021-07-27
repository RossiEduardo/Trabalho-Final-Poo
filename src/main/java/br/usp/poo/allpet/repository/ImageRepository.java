package br.usp.poo.allpet.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usp.poo.allpet.model.Anuncio;
import br.usp.poo.allpet.model.Image;

public interface ImageRepository extends JpaRepository<Image, Integer> {
	
	Optional<Image> findByName (String name);

}
