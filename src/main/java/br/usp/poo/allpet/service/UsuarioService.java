package br.usp.poo.allpet.service;

import br.usp.poo.allpet.model.Usuario;
import br.usp.poo.allpet.repository.AnuncioRepository;
import br.usp.poo.allpet.repository.UsuarioRepository;
import br.usp.poo.allpet.viewmodel.UsuarioViewModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

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

    public String login(String email, String password) {
        Usuario user = usuarioRepository.findByEmail(email);
        if (user == null)
            return "Usuário não existe!";
        if (!user.getSenha().equals(password))
            return "Senha inválida!";
        return "Login feito com sucesso!";
    }
    
    public UsuarioViewModel getAnuncioByUsuario (Usuario usuario) {

    	return new UsuarioViewModel(usuario, anuncioRepository.getByUsuario(usuario.getId()));
    	
    }
    
    public String deleteAnuncio (String idAnuncio) {
    	Integer id = Integer.parseInt(idAnuncio);
    	
    	//anuncioRepository.findById(id);
    	
    	anuncioRepository.deleteById(id);
    	
    	return "done";
    	
    }

}
