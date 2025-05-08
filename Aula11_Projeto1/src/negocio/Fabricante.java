package negocio;

import java.util.ArrayList;
import java.util.Collection;

public class Fabricante {
    private String nome = "";

    public Fabricante() {
    }

    public Fabricante(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    //metodos da classe

    public static Collection<Fabricante> getTodos() throws Exception{
        ArrayList<Fabricante> colecao = new ArrayList<Fabricante>();

        colecao.add(new Fabricante("Audi"));
        colecao.add(new Fabricante("BMW"));
        colecao.add(new Fabricante("Chevrolet"));
        colecao.add(new Fabricante("Ford"));
        colecao.add(new Fabricante("Honda"));
        colecao.add(new Fabricante("Jaguar"));
        colecao.add(new Fabricante("Maseratti"));
        colecao.add(new Fabricante("Toyota"));

        return colecao;
    }
}
