package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Caipirinha;
import negocio.Drink;
import negocio.DryMartini;
import negocio.Mixer;
import negocio.MoscowMule;
import negocio.OldFashion;

public class VisaoBar {
	public static void main(String[] args) {
		//Declaração de variáveis
		BufferedReader leitor = new BufferedReader( new InputStreamReader(System.in));
		Drink objDrink = null;
		int opcao = 0;
		
		//Entrada de dados
		try {
			System.out.println("+======================+");
			System.out.println("        | Cardápio |"    );
			System.out.println("+======================+");
			System.out.println("     |1- Caipirinha  | ");
			System.out.println("     |2- Dry Martini | ");
			System.out.println("     |3- Old Fashion |  ");
			System.out.println("     |4- Moscow Mule |  ");
			System.out.println("+======================+ ");
			System.out.print("Digite sua opção: ");
			opcao = Integer.parseInt(leitor.readLine());
			
			switch (opcao) {
			case 1:
				objDrink = new Caipirinha();
				break;
			case 2:
				objDrink = new DryMartini();
				break;
			case 3:
				objDrink = new OldFashion();
				break;
			case 4:
				objDrink = new MoscowMule();
				break;
			}
			((Mixer)objDrink).misturar();
			objDrink.beber();
			
			
			
		}catch(Exception erro) {
			System.out.println("Chega de beber! Vá pra casa");
		}
	}

}
