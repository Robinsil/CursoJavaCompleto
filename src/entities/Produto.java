package entities;

public class Produto {

	private String name;
	private double price;
	private int quantidade;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double totalValueInStock() {
		double total = price * quantidade;
		return total;

	}

	@Override
	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantidade + "units, Total: $"
				+ String.format("%.2f", totalValueInStock());
	}

	public void addProduct(int quantiade) {

		this.quantidade += quantidade;

	}

	public void removeProduto(int quantidade) {
		this.quantidade -= quantidade;

	}

}
