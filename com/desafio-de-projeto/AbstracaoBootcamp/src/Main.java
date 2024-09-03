import desafio.dominio.Bootcamp;
import desafio.dominio.Curso;
import desafio.dominio.Dev;
import desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //instanciando curso java
        Curso curso1 = new Curso();
        curso1.setTitulo("JAVA");
        curso1.setDescricao("Descricao curso JAVA");
        curso1.setCargaHoraria(8);

        //instanciando curso javaScript
        Curso curso2 = new Curso();
        curso2.setTitulo("Java Script");
        curso2.setDescricao("Descricao JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria java");
        mentoria1.setDescricao("Descricao Mentoria");
        mentoria1.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        //Bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        //devs
        Dev devBruno = new Dev();
        devBruno.setNome("Bruno");
        devBruno.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos Inscritos Bruno: " + devBruno.getConteudoIncritos());

        devBruno.progredir();

        System.out.println("Conteudos  Comcluidos Bruno: " + devBruno.getConteudoConcluido());
        System.out.println("Conteudos Inscritos Bruno: " + devBruno.getConteudoIncritos());
        System.out.println("XP: " + devBruno.calcularTotalXp());

        System.out.println("--------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos Inscritos joão: " + devJoao.getConteudoIncritos());

        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();

        System.out.println("Conteudos Comcluidos  joão: " + devJoao.getConteudoConcluido());
        System.out.println("Conteudos Inscritos joão: " + devJoao.getConteudoIncritos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

    }
}