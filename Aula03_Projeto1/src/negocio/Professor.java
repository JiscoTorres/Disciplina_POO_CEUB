package negocio; // Define que esta classe faz parte do pacote "negocio", ajudando a organizar o código.

public class Professor { // Declaração da classe Professor, que serve como um molde para criar objetos do tipo Professor.

    // Propriedades (atributos) da classe, que armazenam informações sobre o professor.
    
    private String nome = ""; // Armazena o nome do professor. Começa como uma string vazia para evitar valores nulos.
    private String titulo = ""; // Armazena o título do professor (Ex: Doutor, Mestre). Começa como uma string vazia.
    private double salario = 0; // Armazena o salário do professor. Começa com 0 como valor padrão.

    
    
    
    
    // Construtor sem parâmetros (construtor padrão)
    // Esse construtor cria um professor sem definir nome, título e salário, deixando os valores padrão.
    public Professor() {
        super(); // Chama o construtor da superclasse (Object). Não é obrigatório, mas pode ser usado para clareza.
    }
    
    
    
    

    // Construtor com parâmetros
    // Permite criar um objeto Professor já com nome, título e salário definidos.
    public Professor(String nome, String titulo, double salario) {
        super(); // Chama o construtor da superclasse (Object).
        this.nome = nome; // Define o nome do professor com o valor passado no parâmetro.
        this.titulo = titulo; // Define o título do professor.
        this.salario = salario; // Define o salário do professor.
    }
    
    
    

    // Método getter para obter o nome do professor.
    public String getNome() {
        return nome; // Retorna o nome armazenado.
    }

    
    
    
    // Método setter para modificar o nome do professor.
    public void setNome(String nome) {
        this.nome = nome; // Atualiza o nome do professor.
    }

    
    
    
    // Método getter para obter o título do professor.
    public String getTitulo() {
        return titulo; // Retorna o título armazenado.
    }

    
    
    
    // Método setter para modificar o título do professor.
    public void setTitulo(String titulo) {
        this.titulo = titulo; // Atualiza o título do professor.
    }

    
    
    
    // Método getter para obter o salário do professor.
    public double getSalario() {
        return salario; // Retorna o salário armazenado.
    }

    
    
    
    
    // Método setter para modificar o salário do professor.
    public void setSalario(double salario) {
        this.salario = salario; // Atualiza o salário do professor.
    }
}
