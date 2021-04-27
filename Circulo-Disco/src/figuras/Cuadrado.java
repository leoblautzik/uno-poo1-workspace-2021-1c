package figuras;

public class Cuadrado extends Figura{
	private double lado;
	
	public Cuadrado(String color, double lado) {
		super(color);
		this.lado = lado;
	}
		
	@Override
	public double getSuperficie() {
		return this.lado * this.lado;
	}

	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + ", getColor()=" + getColor() + "]";
	}

	
	

}
