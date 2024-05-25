import desafio.dominio.Curso;
import desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
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





        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);


    }
}