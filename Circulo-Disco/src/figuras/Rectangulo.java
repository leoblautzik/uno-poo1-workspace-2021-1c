package figuras;

public class Rectangulo extends Figura {

	private double base;
	private double altura;
		
	public Rectangulo(String color, double base, double altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}




	@Override
	public double getSuperficie() {
		return this.altura * this.base;
	}




	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + ", getColor()=" + getColor() + "]";
	}




	

}
