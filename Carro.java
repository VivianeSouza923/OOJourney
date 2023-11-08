package provaOO;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    // Construtor da classe Carro
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Método para exibir informações do carro
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    public static void main(String[] args) {
        // Exemplo de uso do construtor da classe Carro
        Carro meuCarro = new Carro("Toyota", "Corolla", 2022);
        meuCarro.exibirInformacoes();
    }
}

