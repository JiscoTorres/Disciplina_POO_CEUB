package apresentacao; // Declaração do pacote onde a classe está localizada


import java.io.BufferedReader; // Importa BufferedReader para leitura de dados do console
import java.io.InputStreamReader; // Importa InputStreamReader para capturar entrada do usuário


import negocio.Compra; // Importa a classe Compra do pacote negocio
import negocio.Produto; // Importa a classe Produto do pacote negocio
import negocio.Tipo; // Importa a classe Tipo do pacote negocio





public class VisaoAmazon { // Declaração da classe principal
	
    public static void main(String[] args) { // Método principal
        // Declaração de variáveis para entrada de dados
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

        
        
        Compra objCompra = new Compra(); // Criação do objeto Compra
        Produto objProduto = new Produto(); // Criação do objeto Produto

        
        
        // Entrada de dados com tratamento de exceção
        try {
            System.out.println("Informe o nome do produto: ");
            objProduto.setNome(leitor.readLine()); // Lê e define o nome do produto

            System.out.println("Informe o tipo do produto: ");
            objProduto.setObjTipo(new Tipo(leitor.readLine())); // Lê e define o tipo do produto

            System.out.println("Informe o preço do produto: ");
            objProduto.setPreco(Double.parseDouble(leitor.readLine())); // Lê e define o preço do produto

            objCompra.setObjProduto(objProduto); // Associa o produto à compra

            System.out.println("Informe a quantidade de produtos: ");
            objCompra.setQuantidade(Integer.parseInt(leitor.readLine())); // Lê e define a quantidade de produtos

            System.out.println("Informe a data da compra: ");
            objCompra.setData(leitor.readLine()); // Lê e define a data da compra

            System.out.println("Informe o número do cartão da compra: ");
            objCompra.setCartao(leitor.readLine()); // Lê e define o número do cartão
            
        } catch (Exception erro) { // Captura erros durante a entrada de dados
            System.out.println("Deu erro" + erro); // Exibe a mensagem de erro
        }

        
        
        // Saída de dados
        System.out.println("Produto: " + objCompra.getObjProduto().getNome()); // Exibe o nome do produto
        System.out.println("Tipo: " + objCompra.getObjProduto().getObjTipo().getDescricao()); // Exibe o tipo do produto
        System.out.println("Data: " + objCompra.getData()); // Exibe a data da compra
        System.out.println("Valor Total: R$ " + objCompra.getQuantidade() * objCompra.getObjProduto().getPreco()); // Calcula e exibe o valor total da compra
    }
}
