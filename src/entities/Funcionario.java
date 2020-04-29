package entities;

public class Funcionario {
	private String nome;
	private double salario;
	private double desconto;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	public double  salarioLiquido() {
		return salario - desconto;
		
	}
	public double aumentoSalarial(double porcentagen) {
		return salario += (salario * porcentagen)/100;
	}
	@Override
	public String toString() {
		return "Employee: " +nome+", $ "+String.format("%.2f", salarioLiquido());
	}
	

}
