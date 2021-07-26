package br.usp.poo.allpet.viewmodel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.usp.poo.allpet.model.Anuncio;
import br.usp.poo.allpet.model.Usuario;
import br.usp.poo.allpet.security.AuthUser;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class UsuarioViewModel extends ViewModel{

	private Map<String, Object> params = new HashMap<>();

	public UsuarioViewModel(Boolean success, String retorno) {
		if (success!=null) {
			params.put("sucesso", success);
			params.put("retorno", retorno);
		}
	}

	public UsuarioViewModel(Usuario usuario) {
		params.put("usuario", usuario);
	}
	
	public UsuarioViewModel(Usuario usuario, List<Anuncio> anuncios) {
		params.put("usuario", usuario);
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
