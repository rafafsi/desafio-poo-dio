import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso1 Java");
        curso1.setDescricao("descrição curso1");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso2 JavaScript");
        curso2.setDescricao("descrição curso2");
        curso2.setCargaHoraria(4);



        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("descricão mentoria java");
        mentoria1.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("bootcamp java developer");
        bootcamp.setDescricao("descrição do curso java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Rafaela Inácio");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("conteúdos inscritos: " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println(" - ");
        System.out.println("conteúdos inscritos: " + dev1.getConteudosInscritos());
        System.out.println("conteúdos concluídos: " + dev1.getConteudosConcluidos());
        System.out.println("total XP: " + dev1.calcularTotalXp());


        System.out.println(" -------------------------- ");


        Dev dev2 = new Dev();
        dev2.setNome("Alice Duque");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("conteúdos inscritos: " + dev2.getConteudosInscritos());
        System.out.println(" - ");
        System.out.println("conteúdos inscritos: " + dev2.getConteudosInscritos());
        System.out.println("conteúdos concluídos: " + dev2.getConteudosConcluidos());
        System.out.println("total XP: " + dev2.calcularTotalXp());

    }
}

        /*
        exemplos de polimorfismo:


        Conteudo conteudo = new Curso();
        Conteudo conteudo2 = new Mentoria();*/

        //com new eu instancio o novo objeto curso1 da classe Curso.
