package br.usp.poo.allpet.service;

import br.usp.poo.allpet.enums.Animal;
import br.usp.poo.allpet.model.Anuncio;
import br.usp.poo.allpet.model.Usuario;
import br.usp.poo.allpet.repository.AnuncioRepository;
import br.usp.poo.allpet.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnuncioService {

    @Autowired
    private AnuncioRepository anuncioRepository;

    public Anuncio getAnuncio(int id) {
        return anuncioRepository.getById(id);
    }

    public void cadastrar(String titulo, short user_id, String cidade,
                          String endereco, String descricao, String telefone,
                          byte[] foto, Animal animal, String email) {

        Anuncio newAnuncio = new Anuncio(null, titulo, descricao, endereco, cidade, telefone, email, animal, foto, user_id);
        anuncioRepository.save(newAnuncio);
    }

}
