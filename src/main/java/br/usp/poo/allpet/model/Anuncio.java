package br.usp.poo.allpet.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Anuncio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short id;

    @Column(length = 100, nullable = false)
    private String titulo;

    @Column(nullable = false)
    private int usuario;

    @Column(length = 100, nullable = false)
    private String cidade;

    @Column(length = 100, nullable = false)
    private String estado;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private String data;

    @Column(nullable = false)
    private short animal;
}
