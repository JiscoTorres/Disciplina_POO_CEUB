package apresentacao;

import negocio.Pessoa;


public class Visao {
	public static void main (String[] args) {
		Pessoa obj1 = new Pessoa(); //Criar um objeto da classe Pessoa. Esse é com o metodo construtor vazio. "Classe Objeto = new COnstrutor()";
		obj1.setNome("João");
		obj1.setEndereco("Sqs 110");
		obj1.setTelefone("99992332");
		
		
		Pessoa obj2 = new Pessoa("Bia", "Asa sul", "9993-8538"); //Esse é com o metodo construtor Cheio
		
		System.out.println("====Objeto 1====");
		System.out.println("Nome do objeto 1: " + obj1.getNome());
		System.out.println("Endereco do objeto 1: " + obj1.getEndereco());
		System.out.println("Telefone do objeto 1: " + obj1.getTelefone());
		
		System.out.println("====Objeto 2====");
		System.out.println("Nome do objeto 2: " + obj2.getNome());
		System.out.println("Endereco do objeto 2: " + obj2.getEndereco());
		System.out.println("Telefone do objeto 2: " + obj2.getTelefone());
	}
}
