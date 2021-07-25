package br.usp.poo.allpet.repository;

import br.usp.poo.allpet.enums.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

import br.usp.poo.allpet.model.Anuncio;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AnuncioRepository extends JpaRepository<Anuncio, Integer> {

    @Query("SELECT a FROM Anuncio a WHERE a.cidade= :cidade AND a.animal= :animal")
    List<Anuncio> getByCidadeAnimal(@Param("cidade") String cidade, @Param("animal") Animal animal);

    @Query("SELECT a FROM Anuncio a WHERE a.cidade= :cidade")
    List<Anuncio> getByCidade(@Param("cidade") String cidade);

    @Query("SELECT a FROM Anuncio a WHERE a.animal= :animal")
    List<Anuncio> getByAnimal(@Param("animal") Animal animal);


}
