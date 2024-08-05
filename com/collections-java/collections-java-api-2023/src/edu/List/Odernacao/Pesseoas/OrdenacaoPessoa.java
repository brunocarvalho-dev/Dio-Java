package edu.List.Odernacao.Pesseoas;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    // Atributo
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void AdicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));

    }

    // Comparado por idade através do comparable
    public List<Pessoa> OrdenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    // Comparado por altura através do comparator
    public List<Pessoa> OrdenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);

        Collections.sort(pessoasPorAltura, new ComparatorPorAutura());

        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa pessoalist = new OrdenacaoPessoa();

        pessoalist.AdicionarPessoa("Fabricio", 21, 1.75);
        pessoalist.AdicionarPessoa("Marta", 24, 1.78);
        pessoalist.AdicionarPessoa("Antonio", 37, 1.91);
        pessoalist.AdicionarPessoa("Carolina", 23, 1.84);
        pessoalist.AdicionarPessoa("Daniela", 19, 1.79);
        pessoalist.AdicionarPessoa("Claudio", 43, 2.05);

        System.out.println(pessoalist.OrdenarPorAltura());
        System.out.println(pessoalist.OrdenarPorIdade());

    }
}
