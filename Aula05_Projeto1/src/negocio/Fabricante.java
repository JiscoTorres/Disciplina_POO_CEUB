package negocio;

public class Fabricante {
	
	//propriedades da classe
	private String nome = "";

	
	//Métodos contrutores 
	
	public Fabricante() {
		super();
	}


	public Fabricante(String nome) {
		super();
		this.nome = nome;
	}

	
	// Método de acesso da classe
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
