package br.usp.poo.allpet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short id;
	
	@Column(length = 100, nullable = false)
	private String nome;
	
	@Column(length = 100, nullable = false)
	private String cidade;
	
	@Column(length = 30, nullable = false, unique = true)
	private String cpf;
	
	@Column(length = 30, nullable = false, unique = true)
	private String telefone;
	
	@Column(length = 64, nullable = false, unique = true)
	private String email;

	@Column(length = 20, nullable = false)
	private String senha;

	public String getSenha() {
		return this.senha;
	}

}
