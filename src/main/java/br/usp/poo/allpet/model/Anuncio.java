package br.usp.poo.allpet.model;

import java.util.Base64;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import br.usp.poo.allpet.enums.Animal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Anuncio {
	//entidade referente às tabelas do banco de dados
	//com as informaçãoes de cada coluna
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 60, nullable = false)
	private String titulo;
	
	@Column(length = 1000, nullable = false)
	private String descricao;
	
	@Column(length = 120, nullable = false)
	private String endereco;
	
	@Column(length = 100, nullable = false)
	private String cidade;
	
	@Column(length = 14, nullable = false)
	private String telefone;
	
	@Column(length = 64, nullable = false)
	private String email;

	@Column(nullable = false)
	private Animal animal;
	
	@Column(nullable = false)
	private Short usuario;
	
	@Column(columnDefinition = "MEDIUMBLOB", nullable=false)
	private byte[] bytes;
	
	
	public String getImagem() {
        byte[] imgBytes = Base64.getEncoder().encode (this.getBytes());
        String img = new String (imgBytes);
		img = "data:image/png;base64," + img;
		
		return img;
	}
	
}
