package br.usp.poo.allpet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usp.poo.allpet.repository.UsuarioRepository;
import br.usp.poo.allpet.viewmodel.IndexViewModel;

@Service
public class IndexService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public IndexViewModel getIndexViewModel() {
		return new IndexViewModel(usuarioRepository.findAll());
	}
	
}
