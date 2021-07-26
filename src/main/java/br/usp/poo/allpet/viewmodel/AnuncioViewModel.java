package br.usp.poo.allpet.viewmodel;

import br.usp.poo.allpet.model.Anuncio;
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

    public Map<String, Object> getParams() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            String currentUserName = authentication.getName();
            params.put("username", currentUserName);
        }
        return params;
    }
}
