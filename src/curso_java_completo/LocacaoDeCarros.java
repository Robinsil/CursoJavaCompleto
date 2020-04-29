package curso_java_completo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.CarRental;
import entities.Veiculo;
import entities.service.BrasilTaxServices;
import entities.service.RentalService;

public class LocacaoDeCarros {
    public static void main(String[] args) throws ParseException{
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	SimpleDateFormat sdf  = new SimpleDateFormat("dd/MM/yyyy HH:ss");
    	System.out.println("Enter rental data");
    	System.out.println("Car model");
    	String veiculo = sc.nextLine();
    	System.out.println("Data de Entrada");
    	Date start = sdf.parse(sc.nextLine());
    	System.out.println("Data de Saida");
    	Date startFinish = sdf.parse(sc.nextLine());
    	
    	CarRental cr = new CarRental(startFinish, start, new Veiculo(veiculo));
    	System.out.println("Digite o preço por Hora");
    	double pricePerHour = sc.nextDouble();
    	System.out.println("Digite o priço por Dia");
    	double pricePerDay = sc.nextDouble();
    	RentalService rentalService = new RentalService(pricePerDay, pricePerHour,new BrasilTaxServices());
    	rentalService.processInvoice(cr);
    	
    	System.out.println("Invoce");
    	System.out.println("Basic Payment: "+String.format("%.2f",cr.getInvoice().getBasicPayment()));
    	System.out.println("Tax: "+String.format("%.2f",cr.getInvoice().getTax()));
    	System.out.println("Total Payment: "+String.format("%.2f",cr.getInvoice().getTotalPayment()));

    	
		sc.close();
	}

}





