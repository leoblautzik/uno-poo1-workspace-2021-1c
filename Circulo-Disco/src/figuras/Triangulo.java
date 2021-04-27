package figuras;

public class Triangulo extends Figura {

	private double base;
	private double altura;
	
	
	
	public Triangulo(String color, double base, double altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double getSuperficie() {
		return this.altura * this.base / 2;
	}

	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + ", getColor()=" + getColor() + "]";
	}

	

}
