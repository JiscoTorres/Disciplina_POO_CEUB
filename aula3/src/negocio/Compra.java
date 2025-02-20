package negocio; // Define o pacote onde a classe está localizada

public class Compra { // Declaração da classe Compra

    // Propriedades da classe (atributos)
    private Produto objProduto = null; // Armazena um objeto do tipo Produto, inicialmente nulo (sem referência)
    private int quantidade = 0; // Armazena a quantidade de produtos, iniciando com 0
    private String data = ""; // Armazena a data da compra, iniciando como uma string vazia
    private String cartao = ""; // Armazena o número do cartão da compra, iniciando como uma string vazia

    
    
    // Métodos Getters e Setters (acessam e modificam os atributos)

    public Produto getObjProduto() { // Método para obter o produto associado à compra
        return objProduto; // Retorna o objeto Produto armazenado
    }

    
    
    public void setObjProduto(Produto objProduto) { // Método para definir o produto da compra
        this.objProduto = objProduto; // Atribui um objeto Produto ao atributo objProduto
    }

    
    
    public int getQuantidade() { // Método para obter a quantidade de produtos comprados
        return quantidade; // Retorna o valor armazenado em quantidade
    }

    
    
    public void setQuantidade(int quantidade) { // Método para definir a quantidade de produtos
        this.quantidade = quantidade; // Atribui um valor ao atributo quantidade
    }

    
    
    public String getData() { // Método para obter a data da compra
        return data; // Retorna a data armazenada
    }

    
    
    public void setData(String data) { // Método para definir a data da compra
        this.data = data; // Atribui um valor ao atributo data
    }

    
    
    public String getCartao() { // Método para obter o número do cartão usado na compra
        return cartao; // Retorna o número do cartão armazenado
    }

    
    
    public void setCartao(String cartao) { // Método para definir o número do cartão
        this.cartao = cartao; // Atribui um valor ao atributo cartao
    }
}
