package br.usp.poo.allpet.service;

import br.usp.poo.allpet.model.Usuario;
import br.usp.poo.allpet.repository.AnuncioRepository;
import br.usp.poo.allpet.repository.UsuarioRepository;
import br.usp.poo.allpet.viewmodel.UsuarioViewModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private AnuncioRepository anuncioRepository;

    public boolean checkUserInDb(String email) {
        Usuario user = usuarioRepository.findByEmail(email);
        return user!=null;
    }
    
    //Adiciona um novo usuário no banco de dados
    public String addUser(String nome, String email, String senha, String cpf, String cidade, String telefone) {
        boolean isInDb = checkUserInDb(email);
        if (isInDb)
            return "Usuário já cadastrado!";
        Usuario user = new Usuario(null,  nome, cidade, cpf, telefone, email, new BCryptPasswordEncoder().encode(senha));
        usuarioRepository.save(user);
        return "Usuário cadastrado com sucesso!";
    }

    public Usuario getUserById(short id) {
        return usuarioRepository.getById((id));
    }

    public UsuarioViewModel loginPage(String error, String logout) {
        return new UsuarioViewModel(error, logout);
    }
    
    public UsuarioViewModel getInfosUsuario (Usuario usuario) {

    	return new UsuarioViewModel(usuario, anuncioRepository.getByUsuario(usuario.getId()));
    	
    }

}
