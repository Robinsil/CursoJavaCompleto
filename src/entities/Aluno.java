package entities;

public class Aluno {

	private String nome;
	private double notaA;
	private double notaB;
	private double notaC;

	public double getNotaA() {
		return notaA;
	}

	public void setNotaA(double notaA) {
		this.notaA = notaA;
	}

	public double getNotaB() {
		return notaB;
	}

	public void setNotaB(double notaB) {
		this.notaB = notaB;
	}

	public double getNotaC() {
		return notaC;
	}

	public void setNotaC(double notaC) {
		this.notaC = notaC;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double calcularMedia() {
		return notaA + notaB + notaC;
	}
	public double verificarPontuacao(double notaFinal) {
		double media =  60 - notaFinal;
		return media;
	}

	
}
