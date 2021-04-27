package figuras;

public class Circulo extends Figura {

	private double radio;

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", getColor()=" + getColor() + "]";
	}

	public Circulo(String color, double radio) {
		super(color);
		this.radio = radio;
	}

	@Override
	public double getSuperficie() {
		return Math.PI * this.radio * this.radio;
	}

}
