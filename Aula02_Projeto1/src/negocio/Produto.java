package negocio;

public class Produto {
public String nome = "";
private Estante objEstante = null;
private int quantidade = 0;



//Ir no source e apertar "Generate Constructor using fields" e depois apertar o "Deselect all" e pronto.
//Agora Ir no source e apertar "Generate Constructor using fields" e pronto.
//Agora ir no Source e apertar o "Generate Getters e Setters" e depois apertar o "select all" e pronto.
public Produto() {
	super();
}


public Produto(String nome, Estante objEstante, int quantidade) {
	super();
	this.nome = nome;
	this.objEstante = objEstante;
	this.quantidade = quantidade;
}


public String getNome() {
	return nome;
}


public void setNome(String nome) {
	this.nome = nome;
}


public Estante getObjEstante() {
	return objEstante;
}


public void setObjEstante(Estante objEstante) {
	this.objEstante = objEstante;
}


public int getQuantidade() {
	return quantidade;
}


public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
}

}
