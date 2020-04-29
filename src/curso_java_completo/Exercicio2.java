package curso_java_completo;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Exercicio2 {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Name:");
		f1.setNome(sc.next());
		System.out.println("Gross salary:");
		f1.setSalario(sc.nextDouble());
		System.out.println("Tax:");
		f1.setDesconto(sc.nextDouble());
		
		System.out.println(f1);
		System.out.println("Which percentage to increase salary?");
		double porcentagen = sc.nextDouble();	
		f1.aumentoSalarial(porcentagen);
		System.out.println("Updated data:" +f1);
		sc.close();

	}

}
