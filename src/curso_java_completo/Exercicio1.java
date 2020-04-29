package curso_java_completo;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Exercicio1 {
	
	public static void main(String[] args) {
		Retangulo retangulo = new Retangulo();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rectangle width and height:");
		retangulo.setAltura(sc.nextDouble());
		retangulo.setLargura(sc.nextDouble());
		retangulo.area();
		retangulo.perimeter();
		retangulo.diagonal();
		System.out.println(retangulo.toString());
		
		
		sc.close();

	}

}
