package com.example.demo.model.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 *  @author fabio
 *classe para representar as contas a pagar, portanto esta eh aquela que nao ira entrar
 *no saldo total. Representa uma pendencia que no futuro devera ser paga
 */
@Entity
@Table(name="contas_a_pagar")
public class ContasAPagar {
	//atributos
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	private Double quantia;
	
	@Column(nullable=false)
	private String descricao;
	
	@Column(nullable=false)
	private LocalDate data;
	
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
	
}
