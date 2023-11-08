package provaOO;

public class Pessoa {
    // Atributos da classe
    private String nome;
    private int idade;
    // da questão 13
    private Endereco endereco;

    // Construtor da classe
    public Pessoa(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
     // da questão 13
        this.endereco = endereco;
    }

    /*
    
    // Método para exibir o nome da pessoa
    public void exibirNome() {
        System.out.println("Nome: " + nome);
    }

    // Método para exibir a idade da pessoa
    public void exibirIdade() {
        System.out.println("Idade: " + idade + " anos");
    }

    // Método para exibir informações completas da pessoa
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
    }
    
    
    
    */
    
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public static void main(String[] args) {
        // Exemplo de uso da classe Pessoa
        Endereco endereco1 = new Endereco("123 Rua Principal", "Cidade A", "Estado X");
        Pessoa pessoa1 = new Pessoa("João", 30, endereco1);
        
        Endereco endereco2 = new Endereco("456 Rua Secundária", "Cidade B", "Estado Y");
        Pessoa pessoa2 = new Pessoa("Maria", 25, endereco2);

        
        /*
        pessoa1.exibirInformacoes();
        pessoa2.exibirInformacoes();
        */
        
        //da questão 13
        
     // Acessando informações da pessoa e seu endereço
        System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade() + " anos e mora em " + pessoa1.getEndereco().getRua() + ", " + pessoa1.getEndereco().getCidade() + ", " + pessoa1.getEndereco().getEstado());

        System.out.println(pessoa2.getNome() + " tem " + pessoa2.getIdade() + " anos e mora em " + pessoa2.getEndereco().getRua() + ", " + pessoa2.getEndereco().getCidade() + ", " + pessoa2.getEndereco().getEstado());
    }
}

