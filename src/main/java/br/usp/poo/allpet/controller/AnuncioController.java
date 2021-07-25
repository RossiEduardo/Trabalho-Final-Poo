package br.usp.poo.allpet.controller;

import br.usp.poo.allpet.enums.Animal;
import br.usp.poo.allpet.model.Anuncio;
import br.usp.poo.allpet.service.AnuncioService;
import br.usp.poo.allpet.viewmodel.AnuncioViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/anuncio")
public class AnuncioController {

    @Autowired
    private AnuncioService anuncioService;

    @GetMapping("/{id}")
    public ModelAndView getAnuncio(@PathVariable(value="id") short id) {
        AnuncioViewModel avm = anuncioService.getAnuncio(id);
        return new ModelAndView("anuncio/anuncio", avm.getParams());
    }

    @GetMapping("/criar")
    public ModelAndView criar() {
        return new ModelAndView("anuncio/criar");
    }

    @PostMapping("/criar")
    public void criar(@RequestParam String titulo,
                          @RequestParam short user_id,
                          @RequestParam String cidade,
                          @RequestParam String endereco,
                          @RequestParam String descricao,
                          @RequestParam String telefone,
                          @RequestParam byte[] foto,
                          @RequestParam String email,
                          @RequestParam Animal animal) {

        anuncioService.cadastrar(titulo, user_id, cidade, endereco, descricao, telefone, foto, animal, email);

    }

    @GetMapping("/busca")
    public ModelAndView busca(@RequestParam(required=false) String regiao, @RequestParam(required=false) Animal animal) {

        AnuncioViewModel avm = anuncioService.buscar(regiao, animal);
        return new ModelAndView("anuncio/busca", avm.getParams());
    }

}
