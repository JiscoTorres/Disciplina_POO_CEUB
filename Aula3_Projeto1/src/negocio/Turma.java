package negocio;

public class Turma {
//Propriedades da classe
	
	private Cadeira objCadeira = null; 
	private Professor objProfessor = null; 
	private String letra = "";
	private Aluno[]  colecao = new Aluno[50];
	public Turma() {
		super();
	}
	public Turma(Cadeira objCadeira, Professor objProfessor, String letra, Aluno[] colecao) {
		super();
		this.objCadeira = objCadeira;
		this.objProfessor = objProfessor;
		this.letra = letra;
		this.colecao = colecao;
	}
	public Cadeira getObjCadeira() {
		return objCadeira;
	}
	public void setObjCadeira(Cadeira objCadeira) {
		this.objCadeira = objCadeira;
	}
	public Professor getObjProfessor() {
		return objProfessor;
	}
	public void setObjProfessor(Professor objProfessor) {
		this.objProfessor = objProfessor;
	}
	public String getLetra() {
		return letra;
	}
	public void setLetra(String letra) {
		this.letra = letra;
	}
	public Aluno[] getColecao() {
		return colecao;
	}
	public void setColecao(Aluno[] colecao) {
		this.colecao = colecao;
	}
	
	
	//Metodos da classe
	
	
	int qtdAlunos = 0;
	
	public void adicionarAluno (Aluno objAluno) {
		colecao [qtdAlunos] = objAluno;
		qtdAlunos++;
	}
	
	
	//para listar os alunos
	public void listarAlunos() {
		System.out.println("Matrícula \t Nome");
		for (int i = 0; i < qtdAlunos ; i++) {
			System.out.println(
					colecao[i].getMatricula() + "\t " +
			colecao[i].getNome());
		}
	}
}
