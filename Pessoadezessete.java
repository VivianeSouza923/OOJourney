package provaOO;

class Pessoadezessete {
    private String nome;
    private int idade;

    public Pessoadezessete(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Outros métodos e getters/setters
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
}

class Alunodezessete extends Pessoadezessete {
    private String matricula;

    public Alunodezessete(String nome, int idade, String matricula) {
        super(nome, idade); // Chama o construtor da classe pai Pessoa
        this.matricula = matricula;
    }

    // Outros métodos e getters/setters específicos para Aluno
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }



    public static void main(String[] args) {
    	Alunodezessete aluno1 = new Alunodezessete("João", 20, "12345");
        System.out.println("Nome do aluno: " + aluno1.getNome());
        System.out.println("Idade do aluno: " + aluno1.getIdade());
        System.out.println("Matrícula do aluno: " + aluno1.getMatricula());
    }
}

