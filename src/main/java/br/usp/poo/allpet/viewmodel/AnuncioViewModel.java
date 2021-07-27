package br.usp.poo.allpet.viewmodel;

import br.usp.poo.allpet.enums.Animal;
import br.usp.poo.allpet.model.Anuncio;
import br.usp.poo.allpet.model.Usuario;
import br.usp.poo.allpet.security.AuthUser;
import br.usp.poo.allpet.security.ImplementsUserDetailsService;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.ArrayList;
import java.util.Base64;
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
    
    //Percorre o array de animais (Enum de Animal.java) e guarda na List como string
    public AnuncioViewModel(Usuario usuario, Animal[] values) {
    	List<String> strings_animais = new ArrayList<>();
    	for(Animal a : values) {
    		strings_animais.add(a.name());
    	}
		params.put("animais", strings_animais);
        params.put("usuario", usuario);
	}

	//adiciona o email na hashMap e retorna todos os parâmetros
    public Map<String, Object> getParams() {
        String authEmail = AuthUser.getEmail();
        params.put("username", authEmail);
        return params;
    }
}
