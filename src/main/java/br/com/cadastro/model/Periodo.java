package br.com.cadastro.model;

public class Periodo {

	private String dia;
	private String horarioInicial;
	private String horarioFinal;
	
	
	public Periodo(String dia, String horarioInicial, String horarioFinal) {
		this.dia = dia;
		this.horarioInicial = horarioInicial;
		this.horarioFinal = horarioFinal;
	}
	
	public String getDia() {
		return dia;
	}
	
	public void setDia(String dia) {
		this.dia = dia;
	}
	
	public String getHorarioInicial() {
		return horarioInicial;
	}
	
	public void setHorarioInicial(String horarioInicial) {
		this.horarioInicial = horarioInicial;
	}
	
	public String getHorarioFinal() {
		return horarioFinal;
	}
	
	public void setHorarioFinal(String horarioFinal) {
		this.horarioFinal = horarioFinal;
	}
	
	
}
