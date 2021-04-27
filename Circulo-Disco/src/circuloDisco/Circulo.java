package circuloDisco;
//Implementar una clase que modele un Circulo, 
//del que se desea conocer: radio, diámetro, 
//perímetro y superficie.
//Nota: Los circulos se inicializan a partir de su radio.

public class Circulo {
	private double perimetro;
	private Punto centro;
	
	public Circulo(double radio, Punto centro) {
		this.setRadio(radio);
		this.centro = centro; 
	}
		
	public void setRadio(double radio) {
		if (radio < 0)
			throw new Error("No se aceptan valores negativos");
		
		this.perimetro = radio * 2 * Math.PI;
	}

	public double getRadio(){
		return this.getDiametro() / 2;
		
	}
	
	public double getDiametro() {
		return this.getPerimetro() / Math.PI;
		
	}
	
	public double getPerimetro() {
		return this.perimetro;
		
	}
	
	public double getSuperficie() {
		return Math.PI * Math.pow(this.getRadio(), 2);
	
	}
	
	public double distancia(Circulo c) {
		return this.centro.distancia(c.centro);
	}
	

}
