package provaOO;

public class Aluno {
    private String nome;
    private int idade;

    // Construtor
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getter para obter o nome
    public String getNome() {
        return nome;
    }

    // Setter para definir o nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para obter a idade
    public int getIdade() {
        return idade;
    }

    // Setter para definir a idade
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno("João", 20);

        // Usando getters e setters para acessar e modificar os atributos
        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.println("Idade do aluno: " + aluno.getIdade());

        aluno.setNome("Maria");
        aluno.setIdade(22);

        System.out.println("Novo nome do aluno: " + aluno.getNome());
        System.out.println("Nova idade do aluno: " + aluno.getIdade());
    }
}
