package edu.List.Odernacao.Pesseoas;

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
}
