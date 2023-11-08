package provaOO;

public class ExemploModificadoresAcesso {
    private String nome;

    // Construtor para inicializar o atributo nome
    public ExemploModificadoresAcesso(String nome) {
        this.nome = nome;
    }

    // Método público para definir o valor do atributo privado
    public void setNome(String novoNome) {
        nome = novoNome;
    }

    // Método público para obter o valor do atributo privado
    public String getNome() {
        return nome;
    }

    public static void main(String[] args) {
        ExemploModificadoresAcesso exemplo = new ExemploModificadoresAcesso("João");

        // Usando os métodos públicos para definir e obter o valor do atributo privado
        exemplo.setNome("Maria");
        System.out.println("Nome: " + exemplo.getNome());
    }
}
