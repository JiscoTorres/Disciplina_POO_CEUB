package negocio; // Define que esta classe faz parte do pacote "negocio", ajudando na organização do código.

public class Aluno { // Declaração da classe Aluno. Uma classe define um tipo de objeto.

    // Propriedades (atributos) da classe

    private int matricula = 0; // Armazena o número de matrícula do aluno. Começa com 0 como valor padrão.
    private String nome = ""; // Armazena o nome do aluno. Começa como uma string vazia para evitar valores nulos.

    
    
    // Construtor com parâmetros
    // Esse construtor permite criar um objeto Aluno já com a matrícula e o nome definidos.
    public Aluno(int matricula, String nome) {
        super(); // Chama o construtor da superclasse (Object). Não é obrigatório, mas pode ser usado para clareza.
        this.matricula = matricula; // Define o valor da matrícula do aluno.
        this.nome = nome; // Define o nome do aluno.
    }

    
    
    // Construtor sem parâmetros (construtor padrão)
    // Esse construtor cria um objeto Aluno sem definir a matrícula e o nome, deixando os valores padrão (0 e "").
    public Aluno() {
        super(); // Chama o construtor da superclasse (Object).
    }

    
    
    // Método getter para obter o número de matrícula do aluno.
    public int getMatricula() {
        return matricula; // Retorna o valor da matrícula.
    }

    
    
    // Método setter para modificar o número de matrícula do aluno.
    public void setMatricula(int matricula) {
        this.matricula = matricula; // Atualiza o valor da matrícula.
    }

    
    
    // Método getter para obter o nome do aluno.
    public String getNome() {
        return nome; // Retorna o nome armazenado.
    }

    
    
    // Método setter para modificar o nome do aluno.
    public void setNome(String nome) {
        this.nome = nome; // Atualiza o valor do nome.
    }


}
