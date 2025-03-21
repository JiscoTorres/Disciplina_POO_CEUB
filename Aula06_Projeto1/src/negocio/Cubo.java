package negocio;

public class Cubo implements Solido {
	// Propriedade da classe
	private double aresta = 0;

	//Métodos contrutores da classe
	public Cubo() {
		super();
	}

	public Cubo(double aresta) {
		super();
		this.aresta = aresta;
	}

	// Métodos de acesso da classe
	public double getAresta() {
		return aresta;
	}

	public void setAresta(double aresta) {
		this.aresta = aresta;
	} 

	//Método implementados da classe
	
	public double calcularArea() {
		return(6* Math.pow(getAresta(), 2));
	}

	public double calcularVolume() {
		return(Math.pow(getAresta(), 3));
	}
}
 