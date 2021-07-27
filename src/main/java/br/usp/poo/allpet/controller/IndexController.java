package br.usp.poo.allpet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.usp.poo.allpet.service.IndexService;
import br.usp.poo.allpet.viewmodel.IndexViewModel;

@RestController()
public class IndexController {
	
	@Autowired
	private IndexService indexService;
	
	//Página incial
	@GetMapping
	public ModelAndView getIndex() {
		IndexViewModel vm = indexService.getIndexViewModel();
		return new ModelAndView("index/inicio", vm.getParams());
	}

	@GetMapping("/sobre")
	public ModelAndView getSobre() {
		IndexViewModel vm = indexService.getIndexViewModel();
		return new ModelAndView("index/sobre", vm.getParams());
	}

	@GetMapping("/contato")
	public ModelAndView getContato() {
		IndexViewModel vm = indexService.getIndexViewModel();
		return new ModelAndView("index/contato", vm.getParams());
	}

}
