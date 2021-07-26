package br.usp.poo.allpet.controller;

import br.usp.poo.allpet.model.Usuario;
import br.usp.poo.allpet.repository.UsuarioRepository;
import br.usp.poo.allpet.security.AuthUser;
import br.usp.poo.allpet.service.AnuncioService;
import br.usp.poo.allpet.service.UsuarioService;
import br.usp.poo.allpet.viewmodel.AnuncioViewModel;
import br.usp.poo.allpet.viewmodel.UsuarioViewModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.HashMap;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;
    
    @Autowired
    private AnuncioService anuncioService;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/cadastro")
    public ModelAndView getCadastro() {
        String email = AuthUser.getEmail();
        if (email != null)
            return new ModelAndView("redirect:/");
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
    public ModelAndView login(@RequestParam(required=false) String error, @RequestParam(required=false) String logout) {
        String email = AuthUser.getEmail();
        if (email != null)
            return new ModelAndView("redirect:/");
        UsuarioViewModel uvm = usuarioService.loginPage(error, logout);
        return new ModelAndView("usuario/login", uvm.getParams());
    }
    
    
    @GetMapping("/perfil")
    public ModelAndView perfil() {

        String email = AuthUser.getEmail();
        Usuario user = usuarioRepository.findByEmail(email);
    	UsuarioViewModel uvm = usuarioService.getAnuncioByUsuario(user);

    	return new ModelAndView("usuario/perfil", uvm.getParams());
    }

    @PostMapping("/perfil")
    public ModelAndView excluirAnuncio(@RequestParam String idAnuncio){
    	usuarioService.deleteAnuncio(idAnuncio);
    	return perfil();
    }


}
