package edu.List.Pesquisa.Livros;

public class Livro {
    private String autor;
    private String titulo;
    private int anoFabricacao;

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Livro(String Titulo, String Autor, int AnoFabricacao) {
        this.autor = Autor;
        this.titulo = Titulo;
        this.anoFabricacao = AnoFabricacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    @Override
    public String toString() {
        return "Titulo='" + titulo + " - Autor='" + autor + " - Ano Publicação=" + anoFabricacao +
                '}';
    }
}
