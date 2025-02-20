package negocio; // Indica que esta classe faz parte do pacote "negocio", ajudando na organização do código.

public class Cadeira { // Declaração da classe Cadeira. Uma classe define um tipo de objeto.

	
    // Atributo (propriedade) da classe
    private String nome = ""; // Variável que armazena o nome da cadeira. Inicia com uma string vazia para evitar valores nulos.

    
    
    // Construtor padrão (sem parâmetros)
    // Um construtor é um método especial que cria objetos dessa classe.
    // Esse construtor não recebe valores e apenas cria um objeto com os valores padrão.
    public Cadeira() {
        super(); // Chama o construtor da superclasse (Object). Não é obrigatório, mas deixa explícito que a classe herda de Object.
    }

    
    
    // Construtor que recebe um nome como parâmetro.
    // Permite criar uma cadeira já com um nome definido.
    public Cadeira(String nome) {
        super(); // Chama o construtor da superclasse (Object).
        this.nome = nome; // Define o nome da cadeira com o valor passado no parâmetro.
    }

    
    
    // Método getter para obter o nome da cadeira.
    // Isso permite acessar o valor da variável privada "nome".
    public String getNome() {
        return nome; // Retorna o nome da cadeira.
    }

    
    
    
    // Método setter para modificar o nome da cadeira.
    // Isso permite alterar o valor da variável privada "nome" de forma controlada.
    public void setNome(String nome) {
        this.nome = nome; // Define um novo valor para a variável "nome".
    }
}
