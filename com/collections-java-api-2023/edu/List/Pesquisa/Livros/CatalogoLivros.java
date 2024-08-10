package edu.List.Pesquisa.Livros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    // Atributos
    private List<Livro> livro;

    public CatalogoLivros() {
        this.livro = new ArrayList<>();
    }

    // Métodos
    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livro.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisaPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livro.isEmpty()) {
            for (Livro l : livro) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public Livro pesquisaPorTitulo(String titulo) {
        Livro livrosPorTitulo = null;
        if (!livro.isEmpty()) {
            for (Livro l : livro) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livrosPorTitulo = l;
                    break;
                }
            }
        }
        return livrosPorTitulo;
    }

    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorAnos = new ArrayList<>();
        if (!livro.isEmpty()) {
            for (Livro l : livro) {
                if (l.getAnoFabricacao() >= anoInicial && l.getAnoFabricacao() <= anoFinal) {
                    livrosPorAnos.add(l);
                }
            }
        }
        return livrosPorAnos;
    }

    public static void main(String[] args) {
        CatalogoLivros livros = new CatalogoLivros();

        livros.adicionarLivro("Titulo 1", "Autor 1", 1990);
        livros.adicionarLivro("Titulo 1", "Autor 2", 1992);
        livros.adicionarLivro("Titulo 2", "Autor 2", 1998);
        livros.adicionarLivro("Titulo 3", "Autor 1", 1999);
        livros.adicionarLivro("Titulo 4", "Autor 3", 2010);
        livros.adicionarLivro("Titulo 5", "Autor 4", 2011);
        livros.adicionarLivro("Titulo 3", "Autor 4", 2020);

        System.out.println(livros.pesquisaPorAutor("Autor 4"));
        System.out.println("----------------------------------\n");
        System.out.println(livros.pesquisaPorTitulo("Titulo 3"));
        System.out.println("----------------------------------\n");
        System.out.println(livros.pesquisaPorIntervaloAnos(1995, 2000));
        System.out.println("----------------------------------\n");

    }
}
