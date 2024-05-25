import desafio.dominio.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //usando POLIMORFISMO par acriar um novo curso a parti da classe conteudo
        Curso curso1 = new Curso();
        curso1.setTitulo("Cruso java");
        curso1.setDescricao("java do basico ao avancado");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Cruso java script");
        curso2.setDescricao("java script do basico ao avancado");
        curso2.setCargaHoraria(8);




        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria java");
        mentoria1.setDescricao("mentoria java");
        //localdate.now vai criar uma data com a data atual (local data)
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developar");
        bootcamp.setDescricao("aprendendo java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("claudio");
        dev1.inscreverBootcamp(bootcamp);
        dev1.progredir();
        System.out.println("Conteudos Inscritos: "+dev1.getNome()+ dev1.getConteudosInscritos());
        System.out.println("Conteudos concluidos: "+ dev1.getNome()+ dev1.getConteudosConcluidos());
        System.out.println("Xp atual: "+dev1.getNome()+" "+dev1.calcularTotalXP());


        Dev dev2 = new Dev();
        dev2.setNome("Roque");
        dev2.inscreverBootcamp(bootcamp);
        dev2.progredir();
        System.out.println("Conteudos Inscritos: "+ dev2.getNome()+ dev2.getConteudosInscritos());
        System.out.println("Conteudos concluidos: "+ dev2.getNome()+ dev2.getConteudosConcluidos());
        System.out.println("Xp atual: "+dev2.getNome()+" "+ dev2.calcularTotalXP());





    }
}