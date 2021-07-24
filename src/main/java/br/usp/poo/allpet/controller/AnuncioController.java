package br.usp.poo.allpet.controller;

import br.usp.poo.allpet.model.Anuncio;
import br.usp.poo.allpet.service.AnuncioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/anuncio")
public class AnuncioController {

    @Autowired
    private AnuncioService anuncioService;

    @GetMapping("/{id}")
    public Anuncio getAnuncio(@PathVariable(value="id") short id) {
        return anuncioService.getAnuncio(id);
    }

    @PostMapping("/cadastrar")
    public void cadastrar(@RequestParam String titulo,
                          @RequestParam int usuario,
                          @RequestParam String cidade,
                          @RequestParam String estado,
                          @RequestParam String descricao,
                          @RequestParam String data,
                          @RequestParam short animal) {

        anuncioService.cadastrar(titulo, usuario, cidade, estado, descricao, data, animal);

    }
}
