package com.example.demo.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.demo.model.transactionCategories.TipoDeTransacao;

/**
 *  @author fabio
 *classe para representar as categorias de transacoes que podem existir
 *as categorais estao em ..........
 */

@Entity
@Table(name="categoria")
public class Categoria {
	//atributos
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	private String nome;
	
	@Column(nullable=false)
	private String descricao;
	
	@Column(nullable=false)
	private TipoDeTransacao tipoDeTransacao;

	///relacionamentos
    @ManyToOne
    @JoinColumn
    private Usuario usuario;
	

}
