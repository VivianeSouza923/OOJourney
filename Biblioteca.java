package provaOO;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> acervo;

    public Biblioteca() {
        acervo = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        acervo.add(livro);
    }

    public void removerLivro(Livro livro) {
        acervo.remove(livro);
    }

    public void listarLivros() {
        for (Livro livro : acervo) {
            System.out.println("Título: " + livro.getTitulo() + ", Autor: " + livro.getAutor());
        }
    }

    public static void main(String[] args) {
        Biblioteca minhaBiblioteca = new Biblioteca();

        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis");
        Livro livro2 = new Livro("A Arte da Guerra", "Sun Tzu");

        minhaBiblioteca.adicionarLivro(livro1);
        minhaBiblioteca.adicionarLivro(livro2);

        System.out.println("Livros na biblioteca:");
        minhaBiblioteca.listarLivros();

        minhaBiblioteca.removerLivro(livro1);

        System.out.println("Livros na biblioteca após a remoção:");
        minhaBiblioteca.listarLivros();
    }
}
