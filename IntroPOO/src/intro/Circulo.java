package intro;

public class Circulo {
	
	private double radio;
	private String color;
	
	public Circulo(double radio, String color){
		this.radio = radio;
		this.color = color;
	}	
	
	public double obtenerRadio() {
		return this.radio;
	}
	
	public String obtenerColor() {
		return this.color;		
	}
	
	public double obtenerDiametro() {
		return this.radio * 2;
	}	
	
	public double obtenerArea() {
		return Math.PI * Math.pow(this.radio, 2);
	}

	public double obtenerLongitudDeCircunsferencia() {
		return this.radio * 2 * Math.PI;
	}
	
	public void dibujar() {
		
		System.out.println("dibujando un círculo " + this.obtenerColor()
							+ " y de radio " + this.obtenerRadio());
		
	}
	

}
