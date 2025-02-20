package negocio;

public class Estante {
	//Propriedades da Classe
	private int numero = 0; //

	
	
	
	//Métodos Construtores da Classe
	public Estante() {//Ir no source e apertar "Generate Constructor using fields" e depois apertar o "Deselect all" e pronto.
		super();
	}
	
	
	public Estante(int numero) {//Agora Ir no source e apertar "Generate Constructor using fields" e pronto.
		super();
		this.numero = numero;
	}

	
	
	
	
	//Métodos de Acesso da Classe
	public int getNumero() {//Agora ir no Source e apertar o "Generate Getters e Setters" e depois apertar o "select all" e pronto.
		return numero;
	}

	
	public void setNumero(int numero) {
		this.numero = numero;
	}

	
	
	
}
