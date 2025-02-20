package negocio;

public class Pessoa { //CLASSE PESSOA
	
		//Propriedades da Classe
	
	private String nome = ""; //Inicialização Vazia 
	private String endereco = ""; //Inicialização Vazia 
	private String telefone = ""; //Inicialização Vazia 
	
	
	
	
		//Métodos Construtores da Classe
	/*
	metodo construtor:  
	1. tem o mesmo nome da classe. 
	2. primeiro a ser executado quando eu instanciar.
	*/
	
	public Pessoa() { //Metodo construtor vazio: Não recebe nada e nao realiza nada.
		
	}
	
	public Pessoa(String nome, String endereco, String telefone) { //Metodo construtor cheio: Recebe e realiza. (String nome, String endereco, String telefone)  é o parametro.
		this.nome = nome;//this é uma autoreferencia. O nome em azul vem da classe e o em marrom vem do parametro acima.
		this.endereco = endereco;//this é uma autoreferencia. O endereco em azul vem da classe e o em marrom vem do parametro acima.
		this.telefone = telefone;//this é uma autoreferencia. O telefone em azul vem da classe e o em marrom vem do parametro acima.
	
	}
	
	
	
		//Métodos de Acesso da Classe
	public String getNome() { // Esse é Método get. getNome() tá vazio pq nao recebe nada, mas retorna o nome. Com isso agoa da pra "pegar" o nome.
		return nome;
	}
	
	public void setNome(String nome) {// Esse é o metodo Set
		this.nome = nome;
	}
	
	
	
	
	
	public String getEndereco() { // Esse é Método get. getEndereco() tá vazio pq nao recebe nada, mas retorna o nome. Com isso agoa da pra "pegar" o nome.
		return endereco;
	}
	
	public void setEndereco(String endereco) {// Esse é o metodo Set
		this.endereco = endereco;
	}
	
	
	
	
	public String getTelefone() { // Esse é Método get. getTelefone() tá vazio pq nao recebe nada, mas retorna o nome. Com isso agoa da pra "pegar" o nome.
		return nome;
	}
	
	public void setTelefone(String telefone) { // Esse é o metodo Set
		this.telefone = telefone;
	}
}
