package br.usp.poo.allpet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.usp.poo.allpet.repository.AnuncioRepository;
import br.usp.poo.allpet.viewmodel.IndexViewModel;

@Service
public class IndexService {

	@Autowired
	private AnuncioRepository anuncioRepository;

	public IndexViewModel getIndexViewModel() {
		return new IndexViewModel(anuncioRepository.findAll(Sort.by(Sort.Direction.DESC, "id")));
	}
	
}
