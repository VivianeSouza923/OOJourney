package provaOO;

import java.util.ArrayList;
import java.util.List;

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + "]";
    }


    public static void main(String[] args) {
        List<Produto> listaDeProdutos = new ArrayList<>();

        // Adicionar produtos à lista
        listaDeProdutos.add(new Produto("Produto 1", 29.99));
        listaDeProdutos.add(new Produto("Produto 2", 49.99));
        listaDeProdutos.add(new Produto("Produto 3", 19.99));

        // Listar os produtos
        System.out.println("Produtos na lista:");
        for (Produto produto : listaDeProdutos) {
            System.out.println(produto);
        }

        // Remover um produto da lista
        listaDeProdutos.remove(1); // Remove o segundo produto (índice 1)

        // Listar os produtos novamente após a remoção
        System.out.println("\nProdutos na lista após remoção:");
        for (Produto produto : listaDeProdutos) {
            System.out.println(produto);
        }
    }  
    
}

