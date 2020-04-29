package entities.service;

import entities.TaxServices;

public  class BrasilTaxServices implements TaxServices {

	@Override
	public double Tax(double amout) {
		if(amout <= 100.0) {
			return amout *0.2;
		}
		else {
			return amout * 0.15;
		}
	}

	

	

}
