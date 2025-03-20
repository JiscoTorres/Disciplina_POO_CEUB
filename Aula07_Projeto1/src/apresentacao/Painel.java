package apresentacao;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Painel extends JPanel{
	private static final long serialVersionUID = 1L; //Pra se livrar dos erros Amarelos!
	
	public void paintComponent(Graphics g) { //O "g" que deixa voce desenhar na tela, qualquer coisa que eu fizer dentro daqui eu vou desenhar na tela
		//Para Sobrescrever o metodo
		
		
		
		//Céu
		g.setColor(Color.cyan);
		g.fillRect(0, 0,1024, 500);
		
		
		//Chão
		g.setColor(Color.GREEN);
		g.fillRect(0, 500, 1024, 268);
		
		//Sol
		g.setColor(Color.orange);
		g.fillOval(850, 50, 120, 120);
		g.setColor(Color.yellow);
		g.fillOval(870, 70, 80, 80);
		
		
		
		
		
		//Frente da Casa
		g.setColor(Color.pink);
		g.fillRect(100, 580, 50, 100);
		
		
		
		//Telhado da casa
		g.drawLine(100, 580, 125, 530);
		g.drawLine(150, 580, 125, 530);
		
		
		
		//Lateral da casa
		g.drawLine(150, 580, 300, 530);
		g.drawLine(300, 530, 300, 630);
		g.drawLine(150, 680, 300, 630);
		
		
		
		//Telhado da Lateral da Casa
		g.drawLine(300, 530, 275, 490);
		g.drawLine(125, 530, 270, 490);
		
		
		
		//Boneco Cabeçudo
		g.setColor(Color.black);
		g.fillOval(650, 600, 20, 20); // (X, y, Altura, Expessua) CABEÇA
		g.drawLine(660, 620, 660, 670); //Tronco
		g.drawLine(630, 630, 690, 630); //Braço
		g.drawLine(660, 670, 630, 700); //Perna esquerda
		g.drawLine(660, 670, 690, 700); //Perna Direita
		
	}
}
