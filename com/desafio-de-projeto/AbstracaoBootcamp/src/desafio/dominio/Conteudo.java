package desafio.dominio;

/**
 * <h1>Conteudo</h1>
 * <p>
 *     Classe abstrata desenvolvida para criação das classes do BootCamp;
 * </p>
 * @author Bruno Carvalho
 * @since 06/09/2024
 * @version 1.0
 */
public abstract class Conteudo {
    protected  static final double XP_PADRAO = 10D;
    private String titulo;
    private String descricao;

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract double calcularXp();
}
