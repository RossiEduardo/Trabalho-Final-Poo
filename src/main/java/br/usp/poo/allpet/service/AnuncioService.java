package br.usp.poo.allpet.service;

import br.usp.poo.allpet.model.Anuncio;
import br.usp.poo.allpet.repository.AnuncioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnuncioService {

    @Autowired
    private AnuncioRepository anuncioRepository;

    public Anuncio getAnuncio(short id) {
        return anuncioRepository.getById(id);
    }

    public void cadastrar(String titulo, int usuario, String cidade,
                          String estado, String descricao, String data, short animal) {
        Anuncio newAnuncio = new Anuncio(null, titulo, usuario, cidade, estado, descricao, data, animal);
        anuncioRepository.save(newAnuncio);
    }

}
