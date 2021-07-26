package br.usp.poo.allpet.viewmodel;

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
	
	
	@Override
	public Map<String, Object> getParams() {
		AuthUser authUser = new AuthUser();
		String authEmail = authUser.getEmail();
		params.put("username", authEmail);
		return params;
	}

}
