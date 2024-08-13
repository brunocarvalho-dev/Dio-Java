package Pessoas;

public class Pessoa extends CpfValidation {
    private String nome;
    private String cpf;

    public Pessoa(String nome, String CPF) {
        this.nome = nome;
        this.cpf = validation_CPF(CPF);
    }


    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf.subSequence(0,3)+".***."+cpf.subSequence(6,9)+"-**";
    }
}
