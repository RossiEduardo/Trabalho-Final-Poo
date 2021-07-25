package br.usp.poo.allpet.viewmodel;

import br.usp.poo.allpet.model.Anuncio;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BuscaViewModel {

    private Map<String, Object> params = new HashMap<>();

    public BuscaViewModel(List<Anuncio> anuncios) {
        params.put("anuncios", anuncios);
    }

    public Map<String, Object> getParams() {
        return params;
    }
}
