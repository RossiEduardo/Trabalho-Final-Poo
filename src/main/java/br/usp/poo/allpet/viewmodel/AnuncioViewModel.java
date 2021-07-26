package br.usp.poo.allpet.viewmodel;

import br.usp.poo.allpet.model.Anuncio;
import br.usp.poo.allpet.security.AuthUser;
import br.usp.poo.allpet.security.ImplementsUserDetailsService;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnuncioViewModel {
    private Map<String, Object> params = new HashMap<>();

    public AnuncioViewModel(Anuncio anuncio) {
        params.put("anuncio", anuncio);
    }

    public AnuncioViewModel(List<Anuncio> anuncios) {
        params.put("anuncios", anuncios);
    }
    
    //adiciona o email na hashMap e retorna todos os parâmetros
    public Map<String, Object> getParams() {
        String authEmail = AuthUser.getEmail();
        params.put("usuario", authEmail);
        return params;
    }
}
