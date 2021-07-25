package br.usp.poo.allpet.controller;

import br.usp.poo.allpet.enums.Animal;
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
}
