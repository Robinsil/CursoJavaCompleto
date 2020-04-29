package entities;

import java.util.Date;

public class CarRental {
	private Date startFinish;
	private Date start;
	private Invoice invoice;
	
	private Veiculo veiculo;
	
	public CarRental() {
	}

	public CarRental(Date startFinish, Date start, Veiculo veiculo) {
		this.startFinish = startFinish;
		this.start = start;
		this.veiculo = veiculo;
	}

	public Date getStartFinish() {
		return startFinish;
	}

	public void setStartFinish(Date startFinish) {
		this.startFinish = startFinish;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	

}
