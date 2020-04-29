package entities;

public class Triangle {
	
	public double A;
	public double B;
	public double C;
	
	
	public double calculoTriangulo() {
		
		double p = (A+B+C)/2.0;
		double area = Math.sqrt(p*(p-A)*(p-B)*(p-C));
		
		
		return area;
	}
	

}
