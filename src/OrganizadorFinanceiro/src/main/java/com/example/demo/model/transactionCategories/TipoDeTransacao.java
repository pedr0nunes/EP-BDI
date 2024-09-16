package com.example.demo.model.transactionCategories;

public enum TipoDeTransacao {
	ENTRADAS(1, "ENTRADA"),SAIDA(2,"GASTOS");
	
	//info de codigo(1 ou 2) e descricao(ENTRADA ou SAIDA)
	private String descricaoTransacao;
	private int codigoTransacao;
	
	//construtor
	TipoDeTransacao(int codigo, String descricao) {
		this.codigoTransacao=codigo;
		this.descricaoTransacao=descricao;
	}

    public static TipoDeTransacao toEnum(Integer codigo) {
        if(codigo == null) 
            return null;
        
        for (TipoDeTransacao cod : TipoDeTransacao.values()) 
            if(codigo.equals(cod.getCodigoTransacao()))
            	return cod;
            
        
        throw new IllegalArgumentException("Id invalido: " + codigo + " para enum TipoDeTransacao." );
    }
	
	
	//getters
	public String getDescricaoTransacao() {
		return descricaoTransacao;
	}


	public int getCodigoTransacao() {
		return codigoTransacao;
	}
	

	
	
	
	
}
