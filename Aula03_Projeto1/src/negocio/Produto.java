package negocio; // Define o pacote onde a classe está localizada

public class Produto { // Declaração da classe Produto

    // Propriedades da classe (atributos)

    private String nome = ""; // Armazena o nome do produto, inicia como uma string vazia
    private Tipo objTipo = null; // Armazena o tipo do produto, inicialmente sem referência (null)
    private double preco = 0; // Armazena o preço do produto, iniciando em 0

    // Métodos Getters e Setters (usados para acessar e modificar os atributos)

    public String getNome() { // Obtém o nome do produto
        return nome;
    }
    
    public void setNome(String nome) { // Define o nome do produto
        this.nome = nome;
    }
    
    public Tipo getObjTipo() { // Obtém o tipo do produto
        return objTipo;
    }
    
    public void setObjTipo(Tipo objTipo) { // Define o tipo do produto
        this.objTipo = objTipo;
    }
    
    public double getPreco() { // Obtém o preço do produto
        return preco;
    }
    
    public void setPreco(double preco) { // Define o preço do produto
        this.preco = preco;
    }
}
