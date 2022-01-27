import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    Curso curso1 = new Curso();
    curso1.setTitulo("curso java");
    curso1.setDescricao("descrição curso java");
    curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("O dev vai aprender na prática como desenvolver utilizando a IDE Javascript");
        curso2.setCargaHoraria(56);




        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Nessa mentoria o dev ira tirar as dúvidas e realizar desafios");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Curso de Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMatheus = new Dev () ;
        devMatheus.setNome("Matheus");
        devMatheus.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Matheus " + devMatheus.getConteudosInscritos());
        devMatheus.progredir();
        System.out.println(" ----- ");
        System.out.println("Conteudos Inscritos Matheus " + devMatheus.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Matheus " + devMatheus.getConteudosConcluidos());
        System.out.println("XP: " + devMatheus.calcularTotalXp());

        Dev devClaudia = new Dev ();
        devMatheus.setNome("Claudia" );
        devClaudia.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Claudia" +  devClaudia.getConteudosInscritos());
        devClaudia.progredir();
        devClaudia.progredir();
        System.out.println(" ----- ");
        System.out.println("Conteudos Inscritos Claudia" +  devClaudia.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Claudia " + devClaudia.getConteudosConcluidos());
        System.out.println("XP: " + devClaudia.calcularTotalXp());



    }
}
