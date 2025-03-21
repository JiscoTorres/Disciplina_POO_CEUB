package negocio;

public class DryMartini extends Drink implements Mixer {
	public void misturar(){
		super.adicionar(new Ingrediente("Gyn", 100, "ml"));
		super.adicionar(new Ingrediente("vooka", 50, "ml"));
		super.adicionar(new Ingrediente("Vermut", 10, "ml"));
		super.adicionar(new Ingrediente("Gelo", 10, "pedras"));
		super.adicionar(new Ingrediente("Azeitona", 3, "Unidades"));
	}

}
