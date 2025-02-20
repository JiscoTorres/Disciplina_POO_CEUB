package negocio;



public class Autor {

	

	// Propiedade da Classe 

	private String nome = "";

	

	// Metodo construtor de classe 

	

	public Autor() {

		

	}

	

	public Autor(String nome) {

		this.nome = nome;

	}

	

	// Metodos de classe 

	public String getNome() {

		return nome;

	}

	

	public void setNome(String nome) {

		this.nome = nome;

	}

}