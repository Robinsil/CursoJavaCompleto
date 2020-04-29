package curso_java_completo;

import java.util.Scanner;

public class EstruraDeRepeticaoFor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um o total de números a serem somados.");
		int N = sc.nextInt();
		int soma = 0;
		for (int i = 0; i < N; i++) {
			int X = sc.nextInt();
			soma = soma + X;

		}
        System.out.println("Soma = "+soma);
		sc.close();

	}

}
