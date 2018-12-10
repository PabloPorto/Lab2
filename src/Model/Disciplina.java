package Model;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
	private String nomeDisciplina;
	private int horasTrabalhadas;
	private List<Double> notas = new ArrayList<>();
	
	public Disciplina (String nomeDisciplina){
		this.nomeDisciplina = nomeDisciplina;
	}
	
	public void cadastraHoras(int horas) {
		this.horasTrabalhadas += horas;
	}
	
	public void cadastraNota(int idNota, double valorNota) {
		this.notas.add(idNota -1,valorNota);
	}
	
	private double media() {
		 double soma = 0.0;
		 for (double nota : notas) {
			 soma += nota;
		 }
		 return soma/4.0;
	}
	
	public boolean aprovado() {
		if (this.media() >= 7.0) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		return this.nomeDisciplina + " " +
				this.horasTrabalhadas + " " +
				this.media() + " " +
				this.notas;
	}
}
