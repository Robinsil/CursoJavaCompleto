package curso_java_completo;

import java.util.Locale;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		String dia;
		switch (x) {

		case 1:
			dia = "Domingo";
			break;

		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		default:
			dia = "Valor invalido";
			break;

		}

		System.out.println("O dia da semana è " + dia);
		sc.close();
	}
}
