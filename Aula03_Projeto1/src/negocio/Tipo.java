package negocio; // Indica que esta classe pertence ao pacote "negocio". Pacotes ajudam a organizar as classes em grupos.

// Declaração da classe Tipo. Uma classe é como um molde para criar objetos.
public class Tipo {

    // Declaração de uma propriedade (atributo) da classe.
    // "descricao" é uma variável que vai guardar uma informação do tipo String (texto).
    // Ela começa com um valor vazio ("") para garantir que não esteja "nula".
    private String descricao = "";

    
    
    // Construtor sem parâmetros.
    // Um construtor é um método especial usado para criar objetos desta classe.
    // Este construtor não precisa de nenhuma informação para criar um objeto Tipo.
    public Tipo() {
        super(); // Chama o construtor da classe pai (nesse caso, a classe Object, que é a base de todas as classes em Java).
               // Mesmo que não seja necessário chamar o super() explicitamente, isso deixa claro que estamos seguindo o processo padrão.
    }
    
    
    
    
    // Construtor com um parâmetro.
    // Permite que, ao criar um objeto Tipo, você já forneça uma descrição.
    public Tipo(String descricao) {
        super(); // Chama o construtor da classe pai.
        this.descricao = descricao; // "this.descricao" refere-se à variável desta classe.
                                 // O valor passado no parâmetro "descricao" é atribuído à propriedade da classe.
                                 // Assim, o objeto é criado com uma descrição já definida.
    }
    
    
    
    
    // Método "getter" para obter (ler) o valor da propriedade "descricao".
    // Um getter permite que outras partes do programa acessem o valor de uma propriedade privada.
    public String getDescricao() {
        return descricao; // Retorna o valor atual da variável "descricao".
    }
    
    
    
    
    // Método "setter" para modificar (escrever) o valor da propriedade "descricao".
    // Um setter permite que outras partes do programa alterem o valor de uma propriedade privada de forma controlada.
    public void setDescricao(String descricao) {
        this.descricao = descricao; // Atribui um novo valor à variável "descricao".
    }
}
