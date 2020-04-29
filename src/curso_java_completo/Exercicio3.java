package curso_java_completo;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno A1 = new Aluno();

		A1.setNome(sc.next());
		A1.setNotaA(sc.nextDouble());
		A1.setNotaB(sc.nextDouble());
		A1.setNotaC(sc.nextDouble());

		double notaFinal = A1.calcularMedia();
		if (notaFinal >= 60) {
			System.out.println("FINAL GRADE = " + String.format("%.2f", notaFinal) + "\n PASS");

		} else {

			System.out.println("FINAL GRADE =" + notaFinal + "\n" + "FAILED \n" + "MISSING " + A1.verificarPontuacao(notaFinal) + " POINTS");
		}

		sc.close();
	}

}
