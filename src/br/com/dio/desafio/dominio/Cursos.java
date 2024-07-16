package br.com.dio.desafio.dominio;

public class Cursos extends Conteudo{

	private String titulo;
	private String descricao;
	private int cargaHoraria;

	
	public Cursos(String titulo, String descricao) {
		this.titulo = titulo;
		this.descricao = descricao;
		
	}
	public Cursos() {};
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	
	@Override
	public double calcularXp() {
		return XP_PADRAO + 30;
	}
	
	
	@Override
	public String toString() {
		return "Curso [titulo=" + titulo + ", descricao=" + descricao + ", Carga horária= " + cargaHoraria + ", Xp:"+ calcularXp() + "]";
	}

	
	
}
