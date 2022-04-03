package projeto.bootcamp.poo;

import java.time.LocalDate;

public class Main {
 public static void main(String[] args) {
	 Curso curso1 = new Curso();
     curso1.setTitulo("curso java");
     curso1.setDescricao("descri��o java");
     curso1.setCargaHoraria(10);

     Curso curso2 = new Curso();
     curso2.setTitulo("curso Ruby");
     curso2.setDescricao("descri��o Ruby");
     curso2.setCargaHoraria(3);

     Mentoria mentoria = new Mentoria();
     mentoria.setTitulo("mentoria de java");
     mentoria.setDescricao("descri��o java");
     mentoria.setData(LocalDate.now());

     /*System.out.println(curso1);
     System.out.println(curso2);
     System.out.println(mentoria);*/

     Bootcamp bootcamp = new Bootcamp();
     bootcamp.setNome("Bootcamp Java Developer");
     bootcamp.setDescricao("Descri��o Bootcamp Java Developer");
     bootcamp.getConteudos().add(curso1);
     bootcamp.getConteudos().add(curso2);
     bootcamp.getConteudos().add(mentoria);

     Dev devCamila = new Dev();
     devCamila.setNome("Camila");
     devCamila.inscreverBootcamp(bootcamp);
     System.out.println("Conte�dos Inscritos Camila:" + devCamila.getConteudosInscritos());
     devCamila.progredir();    
     System.out.println("-");
     System.out.println("Conte�dos Inscritos Camila:" + devCamila.getConteudosInscritos());
     System.out.println("Conte�dos Conclu�dos Camila:" + devCamila.getConteudosConcluidos());
     System.out.println("XP:" + devCamila.calcularTotalXp());

     System.out.println("-------");

     Dev devJoao = new Dev();
     devJoao.setNome("Joao");
     devJoao.inscreverBootcamp(bootcamp);
     System.out.println("Conte�dos Inscritos Jo�o:" + devJoao.getConteudosInscritos());
     devJoao.progredir();     
     System.out.println("-");
     System.out.println("Conte�dos Inscritos Jo�o:" + devJoao.getConteudosInscritos());
     System.out.println("Conte�dos Concluidos Jo�o:" + devJoao.getConteudosConcluidos());
     System.out.println("XP:" + devJoao.calcularTotalXp());

 }
	 
	 
}

