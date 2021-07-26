package br.usp.poo.allpet.controller;

import br.usp.poo.allpet.model.Usuario;
import br.usp.poo.allpet.repository.UsuarioRepository;
import br.usp.poo.allpet.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/cadastro")
    public ModelAndView getCadastro() {
        return new ModelAndView("usuario/cadastro");
    }

    @PostMapping("/cadastro")
    public String addUser(@RequestParam String email, @RequestParam String nome, @RequestParam String senha, @RequestParam String cpf,
                          @RequestParam String cidade, @RequestParam String telefone) {
        return usuarioService.addUser(
                nome, email,
                senha, cpf,
                cidade, telefone
        );
    }

    @GetMapping("/login")
    public ModelAndView login(@RequestParam(required=false) String error, @RequestParam(required=false) String ls) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("error", error!=null);
        params.put("logout", ls!=null);
        return new ModelAndView("usuario/login", params);
    }


}
