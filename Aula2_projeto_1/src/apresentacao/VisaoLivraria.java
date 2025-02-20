package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Autor;
import negocio.Livro;



public class VisaoLivraria {//Ctrl + Shift + o = Resolve os problemas do código.
	
	
	public static void main (String[] args) { 
		
		
		
		//Declarações de Variáveis
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in)); //Isso é Comando de Input do java
		Livro objLivro = new Livro();
	
		

		
		
		
		//Entrada de Dados
		try {
			System.out.print("Digite o título do Livro: ");	
			objLivro.setTitulo(leitor.readLine());
			
			System.out.print("Digite o nome do Autor do Livro: ");	
			objLivro.setObjAutor(new Autor(leitor.readLine()));//Só Aqui que tem o "new" Autor pq lá no Livro, é private Autor objAutor = null e não public string objAutor, ou seja, é uma Classe!
			
			System.out.print("Digite o Genero do Livro: ");	
			objLivro.setGenero(leitor.readLine());
	} 
		
		
	catch(Exception erro) {}
		
		
		
		
		//Saída de Dados
		System.out.println("Título: " + objLivro.getTitulo());
		System.out.println("Autor: " + objLivro.getObjAutor().getNome());
		System.out.println("Genero: " + objLivro.getGenero());
}
}