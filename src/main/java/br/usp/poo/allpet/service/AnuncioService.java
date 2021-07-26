package br.usp.poo.allpet.service;

import br.usp.poo.allpet.enums.Animal;
import br.usp.poo.allpet.model.Anuncio;
import br.usp.poo.allpet.model.Usuario;
import br.usp.poo.allpet.repository.AnuncioRepository;
import br.usp.poo.allpet.repository.UsuarioRepository;
import br.usp.poo.allpet.security.AuthUser;
import br.usp.poo.allpet.viewmodel.AnuncioViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnuncioService {

    @Autowired
    private AnuncioRepository anuncioRepository;
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    public AnuncioViewModel getAnuncio(int id) {
        return new AnuncioViewModel(anuncioRepository.getById(id));
    }
    
    //Cadastrar um anúncio
    public void cadastrar(String titulo, String user_email, String cidade,
                          String endereco, String descricao, String telefone,
                          Animal animal, String email) {
        Usuario usuario = usuarioRepository.findByEmail(user_email);
        Anuncio newAnuncio = new Anuncio(null, titulo, descricao, endereco, cidade, telefone, email, animal, usuario.getId());
        anuncioRepository.save(newAnuncio);
    }
    
    //Busca os anúncios dado uma cidade e um animal
    public AnuncioViewModel buscar(String cidade, Animal animal) {
        if (cidade != null && animal != null)
            return new AnuncioViewModel(anuncioRepository.getByCidadeAnimal(cidade, animal));
        if (animal == null)
            return new AnuncioViewModel(anuncioRepository.getByCidade(cidade));

        return new AnuncioViewModel(anuncioRepository.getByAnimal(animal));
    }
    
    //Deleta um anúncio pelo id
    public String deleteAnuncio (String idAnuncio) {
    	Integer id = Integer.parseInt(idAnuncio);
    	
    	Anuncio anuncio = anuncioRepository.getById(id);
    	Usuario user = usuarioRepository.getById( anuncio.getUsuario() );
    	
    	//verifica se o anúncio pertence ao usuário logado
    	if ( (user.getEmail()).equals( AuthUser.getEmail() ) ) {
        	anuncioRepository.deleteById(id);
        	return "done";
    	}

    	return "error";
    }

}
