package edu.Set.Pesquisa.ListaContato;

import java.util.Objects;

public class Contato {
    private String nome;
    private int numero;

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return getNumero() == contato.getNumero();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumero());
    }

    @Override
    public String toString() {
        return "Nome= " + nome + " - Numero= " + numero + "\n";
    }
}
