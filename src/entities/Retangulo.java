package entities;

public class Retangulo {
	private double largura;
	private double altura;

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double area() {
		return largura * altura;

	}

	public double perimeter() {
		return largura + largura + altura + altura;

	}

	public double diagonal() {

		return Math.sqrt(largura * largura + altura * altura);

	}

	@Override
	public String toString() {
		return "Area = " + String.format("%.2f", area()) + "\n" + "Perimetro = " + String.format("%.2f", perimeter())
				+ "\n" + "Diagonal = " + String.format("%.2f", diagonal());

	}

}
