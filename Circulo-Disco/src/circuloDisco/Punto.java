package circuloDisco;

public class Punto {
	
	private Double x;
	private Double y;
	
	
	public Punto(Double x, Double y) {
		this.x = x;
		this.y = y;
	}
	
	public static double distancia(Punto p1, Punto p2) {
		
		return Math.sqrt(Math.pow((p2.y-p1.y),2) + Math.pow((p2.x-p1.x),2));
	}
	
	public double distancia(Punto p) {
		return Math.sqrt(Math.pow((this.y-p.y),2) + Math.pow((this.x-p.x),2));
	}
	
	
}
