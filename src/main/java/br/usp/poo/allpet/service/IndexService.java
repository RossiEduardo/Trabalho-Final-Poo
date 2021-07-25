package br.usp.poo.allpet.service;

import br.usp.poo.allpet.repository.AnuncioRepository;
import br.usp.poo.allpet.viewmodel.AnuncioViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.usp.poo.allpet.repository.UsuarioRepository;
import br.usp.poo.allpet.viewmodel.IndexViewModel;

@Service
public class IndexService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private AnuncioRepository anuncioRepository;

	public IndexViewModel getIndexViewModel() {
		return new IndexViewModel(anuncioRepository.findAll(Sort.by(Sort.Direction.DESC, "id")));
	}
	
}
