package desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

/**<h1>Dev</h1>
 * <p>
 *     Sistema desenvolvido para simulação de um Desenvolvedor incrito para um Bootcamp;
 * </p>
 *
 * @author Bruno Carvalho
 * @since 06/09/2024
 * @version 1.0
 */
public class Dev {
    //Atributos
    private  String nome;
    private Set<Conteudo> conteudoIncritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudoConcluido = new LinkedHashSet<>();
    private double xp;

    //Métodos

    /**<h1>InscreverBootCamp</h1>
     * <p>
     *     Faz a incrição do Desenvolvesor em um bootcamp, co seu respectivos cursos;
     * </p>
     *
     * @param bootcamp recebe um BootCamp
     */
    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudoIncritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    /**<h1>Progredir</h1>
     * <p>
     *     Adiciona o curso no finalizado no <b>Set de Concluidos</b>, e remove o curso do <b>Set de Inscritos</b>
     * </p>
     */
    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudoIncritos.stream().findFirst();
        if(conteudo.isPresent()) {
            this.conteudoConcluido.add(conteudo.get());
            this.conteudoIncritos.remove(conteudo.get());
        }
        else{
            System.err.println("Voceê não está inscrito em nenhum bootcamp");
        }

    }

    /**
     * <h1>CalcularTotalXp</h1>
     * <p>
     *     Calcula o total de XP Adiquirido, de Acordo com os cursos concluidos;
     * </p>
     * @return Retorna o valor da soma dos XP's do Dev;
     */
    public double calcularTotalXp() {
         this.xp = this.conteudoConcluido.stream() //seleciona todos os conteudo do "conteudoInscritos"
                .mapToDouble //passa por cada item no "conteudoInscritos" para fazer a função abaixo
                        (Conteudo::calcularXp) /* <- função que o map vai realizar (conteudo -> conteudo.calcularXp())
                                                                pegar o xp de cada "conteudoInscritos" e adicionar
                                                                  na variavl "conteudo" e realizar a proxima função*/
                .sum(); // Função Somar
        return this.xp;
    }

    //Getters & Settesr
    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public Set<Conteudo> getConteudoIncritos() {return conteudoIncritos;}

    public void setConteudoIncritos(Set<Conteudo> conteudoIncritos) {this.conteudoIncritos = conteudoIncritos;}

    public Set<Conteudo> getConteudoConcluido() {return conteudoConcluido;}

    public void setConteudoConcluido(Set<Conteudo> conteudoConcluido) {this.conteudoConcluido = conteudoConcluido;}

    //Equals e Hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dev dev)) return false;
        return Objects.equals(getNome(), dev.getNome()) && Objects.equals(getConteudoIncritos(), dev.getConteudoIncritos()) && Objects.equals(getConteudoConcluido(), dev.getConteudoConcluido());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getConteudoIncritos(), getConteudoConcluido());
    }
}
