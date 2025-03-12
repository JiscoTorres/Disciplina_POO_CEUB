package negocio;

public class Moto extends Veiculo {
	
	//Propriedades da classe
	private int  cilindrada = 0;

	
	//Método contrutores 
	
	public Moto() {
		super();
	}


	public Moto(String modelo, Fabricante objFabricante, String cor, int cilindrada) {
		super(modelo, objFabricante, cor);
		this.cilindrada = cilindrada;
	}

	//Método de acesso de classe

	public int getCilindrada() {
		return cilindrada;
	}


	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	
	
}
