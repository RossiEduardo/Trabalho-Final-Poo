package br.usp.poo.allpet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Anuncio {
	
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

	@ManyToOne
	@JoinColumn(nullable = false, name = "usuario_id")
	private Usuario usuario;
	
}
