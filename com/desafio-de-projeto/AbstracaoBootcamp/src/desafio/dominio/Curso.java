package desafio.dominio;

/**
 * <h1>Curso</h1>
 * <p>
 *     Classe desenvolvida para criação dos cursos do BootCamp;
 * </p>
 * @author Bruno Carvalho
 * @since 06/09/2024
 * @version 1.0
 */
public class Curso extends Conteudo{

    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                String.format(", Xp= %.0f",calcularXp()) + '\''  +
                '}';
    }

}
