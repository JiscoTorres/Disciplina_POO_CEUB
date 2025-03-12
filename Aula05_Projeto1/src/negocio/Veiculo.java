package negocio;

public abstract class Veiculo {
	
	//Propriedades da classe
	
	private String modelo = "";
	private Fabricante objFabricante = null;
	private String cor = "";
	
	//Método de contrução 
	
	public Veiculo() {
		super();
	}

	public Veiculo(String modelo, Fabricante objFabricante, String cor) {
		super();
		this.modelo = modelo;
		this.objFabricante = objFabricante;
		this.cor = cor;
	}
	
	//Método de acesso da classe
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Fabricante getObjFabricante() {
		return objFabricante;
	}

	public void setObjFabricante(Fabricante objFabricante) {
		this.objFabricante = objFabricante;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	
	
}
