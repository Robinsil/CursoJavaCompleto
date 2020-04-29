package curso_java_completo;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class CadastroDeProduto {

	public static void main(String[] args) {

		Produto p1;
		p1 = new Produto();

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Produte Data:");
		System.out.print("Nome:");
		p1.setName(sc.next());
		System.out.print("Price:");
		p1.setPrice(sc.nextDouble());
		System.out.println("Quantity in stock:");
		p1.setQuantidade(sc.nextInt());

		System.out.println(p1);
		System.out.println("Enter the number products to be added in stok");
		int quantidade = sc.nextInt();
		p1.addProduct(quantidade);
		p1.totalValueInStock();
		System.out.println(p1);
		System.out.println("Enter the number of products be removed from stock ");
		quantidade = sc.nextInt();
		p1.removeProduto(quantidade);
		System.out.println(p1);

		sc.close();
	}

}
