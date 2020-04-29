package curso_java_completo;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class CalculoDeArea {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		
		Triangle x,y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Digite as medidas para o tringulo x");
		x.A = sc.nextDouble();
		x.B = sc.nextDouble();
		x.C = sc.nextDouble();
		System.out.println("Digite as medidas para o tringulo y");
		y.A = sc.nextDouble();
		y.B = sc.nextDouble();
		y.C = sc.nextDouble();
		
		
		 
		double areaX = x.calculoTriangulo();
		double areaY = y.calculoTriangulo();
	
		
		System.out.printf("Tringulo X area: %.4f%n", areaX);
		System.out.printf("Tringulo y area: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.printf("Tringulo com area maior é o tringulo X");
		}
		else {
			System.out.printf("Tringulo com area maior é o tringulo Y");
		}
			
		
		sc.close();

	}

}
