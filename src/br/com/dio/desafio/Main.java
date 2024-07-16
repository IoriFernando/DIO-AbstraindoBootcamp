package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Cursos;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentorias;

public class Main {

	public static void main(String[] args) {
		
        Cursos curso1 = new Cursos();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);
        
        
        Cursos curso2 = new Cursos();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);
        
        Mentorias mentoria = new Mentorias();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());
        

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudo().add(curso1);
        bootcamp.getConteudo().add(curso2);
        bootcamp.getConteudo().add(mentoria);
        
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverNoBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudoInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudoConcluidos());
        System.out.println("XP:" + devCamila.calculoDoXP());

        System.out.println("-------");
        
        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverNoBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudoInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudoConcluidos());
        System.out.println("XP:" + devJoao.calculoDoXP());
        
	}
}
