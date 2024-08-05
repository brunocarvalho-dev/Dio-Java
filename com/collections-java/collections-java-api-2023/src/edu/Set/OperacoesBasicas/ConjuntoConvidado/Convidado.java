package edu.Set.OperacoesBasicas.ConjuntoConvidado;

import java.util.Objects;

public class Convidado {
    private String nome;
    private int codigoConvite;

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    // Criando metodo para validar o codigo único
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Convidado convidado))
            return false;
        return getCodigoConvite() == convidado.getCodigoConvite();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoConvite());
    }

    @Override
    public String toString() {
        return "Nome= " + nome + " - Código do Convite= " + codigoConvite + "\n";
    }
}
