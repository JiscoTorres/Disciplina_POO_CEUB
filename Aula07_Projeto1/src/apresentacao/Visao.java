package apresentacao;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class Visao extends JFrame{
	//Propriedads da Classe
	private static final long serialVersionUID = 1L;
	
	private JPanel objPainel = new Painel();
	
	//Metodo Principal da execução do programa
	public static void main(String[] args) {
		new Visao().setVisible(true);
	}
	
	
	//Metodo construtor da Classe
	public Visao() {
		//configuração da janela
		setTitle("Minha Primeira Janela JAVA!!!!!");
		setSize(1024, 768);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
		
	//Configuração do Painel
	setContentPane(objPainel);
	}
}
