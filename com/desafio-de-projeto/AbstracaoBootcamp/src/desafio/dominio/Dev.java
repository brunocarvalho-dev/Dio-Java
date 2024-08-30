package desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    //Atributos
    private  String nome;
    private Set<Conteudo> conteudoIncritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudoConcluido = new LinkedHashSet<>();

    //Métodos
    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudoIncritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }
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
    public double calcularTotalXp() {
        return this.conteudoIncritos.stream() //seleciona todos os conteudo do "conteudoInscritos"
                .mapToDouble //passa por cada item no "conteudoInscritos" para fazer a função abaixo
                        (Conteudo::calcularXp) /* <- função que o map vai realizar
                                                                pegar o xp de cada "conteudoInscritos" e adicionar
                                                                  na variavl "conteudo" e realizar a proxima função*/
                .sum(); // Função Somar
    }

    //Getters & Settesr
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoIncritos() {
        return conteudoIncritos;
    }

    public void setConteudoIncritos(Set<Conteudo> conteudoIncritos) {
        this.conteudoIncritos = conteudoIncritos;
    }

    public Set<Conteudo> getConteudoConcluido() {
        return conteudoConcluido;
    }

    public void setConteudoConcluido(Set<Conteudo> conteudoConcluido) {
        this.conteudoConcluido = conteudoConcluido;
    }

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
