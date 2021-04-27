package geometría;

public class Cubo {

	private double volumen;
	private String color = "rojo";

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	/*
	 * post: inicializa el cubo a partir de la medida de lado dada
	 */
	public Cubo(double lado) {
		this.volumen = Math.pow(lado, 3);

	}
	
	/* post: devuelve la longitud de todos los lados del cubo 
	 */
		
	public double medirLongitudLado() {
		return Math.cbrt(this.volumen);
		
	}

}
