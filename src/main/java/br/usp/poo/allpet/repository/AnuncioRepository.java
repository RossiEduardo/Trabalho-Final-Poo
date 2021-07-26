package br.usp.poo.allpet.repository;

import br.usp.poo.allpet.enums.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

import br.usp.poo.allpet.model.Anuncio;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AnuncioRepository extends JpaRepository<Anuncio, Integer> {
	//Cria as querys do banco de dados
	
	//filtra os anúncios por cidade e animal
    @Query("SELECT a FROM Anuncio a WHERE a.cidade= :cidade AND a.animal= :animal")
    List<Anuncio> getByCidadeAnimal(@Param("cidade") String cidade, @Param("animal") Animal animal);

	//filtra os anúncios por cidade
    @Query("SELECT a FROM Anuncio a WHERE a.cidade= :cidade")
    List<Anuncio> getByCidade(@Param("cidade") String cidade);

	//filtra os anúncios por animal
    @Query("SELECT a FROM Anuncio a WHERE a.animal= :animal")
    List<Anuncio> getByAnimal(@Param("animal") Animal animal);

	//filtra os anúncios por usuário
    @Query("SELECT a FROM Anuncio a WHERE a.usuario= :usuario")
    List<Anuncio> getByUsuario(@Param("usuario") Short usuario);

}
