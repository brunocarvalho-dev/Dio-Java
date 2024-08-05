package edu.Set.OperacoesBasicas.ConjuntoConvidado;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    private Set<Convidado> conjuntoSet;

    public ConjuntoConvidado() {
        this.conjuntoSet = new HashSet<>();
    }

    public void AdicionarConvidadoPorConvite(String nome, int convite) {
        conjuntoSet.add(new Convidado(nome, convite));
    }

    public void RemoverConvidadoPorCodigoConvite(int convite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : conjuntoSet) {
            if (c.getCodigoConvite() == convite) {
                convidadoParaRemover = c;
                break;
            }
        }
        conjuntoSet.remove(convidadoParaRemover);
    }

    public String ContarConvidados() {
        return "\nTotal de Convidados = " + conjuntoSet.size() + "\n";
    }

    public void ExibirConvidados() {
        System.out.println(conjuntoSet);
    }

    public static void main(String[] args) {
        // instanciandoo classe ConjuntoConvidado
        ConjuntoConvidado convidado = new ConjuntoConvidado();

        convidado.AdicionarConvidadoPorConvite("Bruno Carvalho", 1);
        convidado.AdicionarConvidadoPorConvite("Michael Jackson", 2);
        convidado.AdicionarConvidadoPorConvite("Carlos Pereira", 3);
        convidado.AdicionarConvidadoPorConvite("Maria Betânia", 4);
        convidado.AdicionarConvidadoPorConvite("Antonio Carlos", 5);
        convidado.AdicionarConvidadoPorConvite("Jose Ramalho", 6);
        convidado.AdicionarConvidadoPorConvite("Rick Martin", 7);
        convidado.AdicionarConvidadoPorConvite("Steve Jobs", 8);
        convidado.AdicionarConvidadoPorConvite("Bruce Winne", 8);
        convidado.AdicionarConvidadoPorConvite("Bruce Lee", 10);

        convidado.ExibirConvidados();
        System.out.println(convidado.ContarConvidados());

        convidado.RemoverConvidadoPorCodigoConvite(0006);
        convidado.RemoverConvidadoPorCodigoConvite(0004);
        convidado.RemoverConvidadoPorCodigoConvite(0003);

        convidado.ExibirConvidados();
        System.out.println(convidado.ContarConvidados());

    }
}
