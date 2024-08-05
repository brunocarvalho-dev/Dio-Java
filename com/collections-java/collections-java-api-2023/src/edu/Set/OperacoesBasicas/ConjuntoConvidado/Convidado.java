package edu.Set.OperacoesBasicas.ConjuntoConvidado;

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

    @Override
    public String toString() {
        return "Nome= " + nome + " - Código do Convite= " + codigoConvite + "\n";
    }
}
