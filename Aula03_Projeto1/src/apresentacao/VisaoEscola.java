package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Aluno;
import negocio.Cadeira;
import negocio.Professor;
import negocio.Turma;

public class VisaoEscola {
	public static void main (String[] args) {
		//Declaração de variaveis
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		
		Turma objTurma = new Turma();
		Professor objProfessor = new Professor();
		
		
		
		
		try {
			System.out.print("Digite o nome da Cadeira: ");
			objTurma.setObjCadeira(new Cadeira (leitor.readLine()));
			
			System.out.print("Digite o nome do Professor: ");
			objProfessor.setNome(leitor.readLine());
			
			
			System.out.print("Digite a titulação do Professor: ");
			objProfessor.setTitulo(leitor.readLine());
			
			System.out.print("Digite o salário do professor: ");
			objProfessor.setSalario(Double.parseDouble(leitor.readLine()));
			
			
			
			
			
			
			do {
				Aluno objAluno = new Aluno();
				
				
				System.out.print("Digite a Matricula do aluno: ");
				objAluno.setMatricula(Integer.parseInt(leitor.readLine()));
				
				

				System.out.print("Digite o nome do aluno: ");
				objAluno.setNome(leitor.readLine());
				
				objTurma.adicionarAluno(objAluno);
				
				
				System.out.print("Digite <S> se houver mais alunos: ");
			} while(leitor.readLine().equalsIgnoreCase("S"));
			
			
			
			
			
			objTurma.setObjProfessor(objProfessor);
			
		} catch (Exception erro) {
			System.out.println("Deu Erro!" + erro);
		}
			
		
		
		
		
		
		//Saída de Dados
		
		System.out.print("Cadeira:"  + objTurma.getObjCadeira().getNome());
		
		System.out.print("Professor:"  + objTurma.getObjProfessor().getTitulo() + " " + objTurma.getObjProfessor().getNome());
		
		System.out.println("Alunos: ");
		objTurma.listarAlunos();
	}
}
