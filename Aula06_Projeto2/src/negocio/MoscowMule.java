package negocio;

public class MoscowMule extends Drink implements Mixer {
	public void misturar() {
		super.adicionar(new Ingrediente("Cachaça", 100, "ml"));
		super.adicionar(new Ingrediente("Limão", 3, "gotas"));
		super.adicionar(new Ingrediente("Açucar", 5, "g"));
		super.adicionar(new Ingrediente("Gelo", 8, "pedras"));
		super.adicionar(new Ingrediente("Gengibre", 20, "g"));
		super.adicionar(new Ingrediente("Espuma de Gengibre", 50, "ml"));
}
}