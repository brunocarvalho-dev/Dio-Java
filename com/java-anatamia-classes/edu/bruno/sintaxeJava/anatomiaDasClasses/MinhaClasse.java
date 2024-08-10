package edu.bruno.sintaxeJava.anatomiaDasClasses;
//Dio_JAVA - Aprendendo Sintaxe JAVA
//Aula - Anatomia das Classes - 3

public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Bruno";
        String segundoNome = "Carvalho";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do Método " +primeiroNome.concat(" ").concat(segundoNome);
    }

}
