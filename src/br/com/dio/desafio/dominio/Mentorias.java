package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentorias extends Conteudo{


	private LocalDate data;


	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
				
	}
	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return  XP_PADRAO+20;
	}
	@Override
	public String toString() {
		return "Mentorias [titulo=" + titulo + ", descricao=" + descricao + ", data= " + data + ", Xp:"+ calcularXp() + "]";
	}
	
	
}