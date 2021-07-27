package br.usp.poo.allpet.viewmodel;

import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;

import java.util.List;
import java.util.Map;

import br.usp.poo.allpet.model.Anuncio;
import br.usp.poo.allpet.security.AuthUser;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class IndexViewModel extends ViewModel {

	private Map<String, Object> params = new HashMap<>();
		
	public IndexViewModel(List<Anuncio> anuncios) {
		params.put("anuncios", anuncios);
	}
	
	
    //adiciona o email na hashMap e retorna todos os parâmetros
	@Override
	public Map<String, Object> getParams() {
		AuthUser authUser = new AuthUser();
		String authEmail = authUser.getEmail();
		params.put("username", authEmail);
		return params;
	}

}
