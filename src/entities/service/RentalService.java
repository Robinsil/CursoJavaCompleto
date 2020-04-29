package entities.service;

import entities.CarRental;
import entities.Invoice;
import entities.TaxServices;

public class RentalService {
	
	private double pricePerDay;
	private double pricePerHour;
	private TaxServices taxService;
	
	public RentalService(double pricePerDay, double pricePerHour, TaxServices taxService) {
		super();
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRental carRental) {
		Long t1 = carRental.getStart().getTime();
		Long t2 = carRental.getStartFinish().getTime();
		double hours =(double) (t2 - t1)/1000/60/60;
		double basicPayment;
		
		if(hours <= 12) {
			basicPayment = Math.ceil(hours) * pricePerHour;
		}else {
			basicPayment = Math.ceil(hours/24) * pricePerDay;
		}
		
		double tax = taxService.Tax(basicPayment);
		carRental.setInvoice(new Invoice(basicPayment,tax));
		
	}

}
