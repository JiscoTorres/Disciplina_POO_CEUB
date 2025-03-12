package negocio;

public class Carro extends Veiculo{
	
	//Propriedades da classe
	private boolean tetosolar = false;

	//Método contrutores 
	public Carro() {
		super();
	}

	public Carro(String modelo, Fabricante objFabricante, String cor, boolean tetosolar) {
		super(modelo, objFabricante, cor);
		this.tetosolar = tetosolar;
	}
	
	// Método de acesso de classe

	public boolean isTetosolar() {
		return tetosolar;
	}

	public void setTetosolar(boolean tetosolar) {
		this.tetosolar = tetosolar;
	}
	
	
	
	

}
