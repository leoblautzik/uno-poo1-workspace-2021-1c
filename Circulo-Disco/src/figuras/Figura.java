package figuras;

public abstract class Figura {
	private String color;

	public Figura(String color) {
		this.color = color;
	}

	public Figura() {
		this("blanco");
	}

	public abstract double getSuperficie();

	public String getColor() {
		return this.color;
	}
	
	public abstract String toString();
	
}
