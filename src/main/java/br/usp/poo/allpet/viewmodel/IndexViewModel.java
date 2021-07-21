package br.usp.poo.allpet.viewmodel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.usp.poo.allpet.model.Usuario;

public class IndexViewModel extends ViewModel {

	private Map<String, Object> params = new HashMap<>();
		
	public IndexViewModel(List<Usuario> usuarios) {
		params.put("usuarios", usuarios);
	}
	
	
	@Override
	public Map<String, Object> getParams() {
		return params;
	}

}
