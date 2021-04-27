package circuloDisco;
/*
 * Implementar una clase que modele un Disco. 
	Se desea conocer: 
 - radio interior
 - radio exterior
 - perímetro interior
 - perímetro exterior 
 - superficie. 

       Debe tener operaciones para cambiar el 
       radio interior y el radio exterior.
 */
public class DiscoCc {
	
	private Circulo circuloChico;
	private Circulo circuloGrande;
	private Punto centro;
	
	public DiscoCc(double radioInterior, double radioExterior, Punto centro) {
		if (radioInterior < 0 || radioExterior < 0)
			throw new Error("No se aceptan radios negativos");
		if(radioInterior >= radioExterior)
			throw new Error ("El radio interior debe ser menor que el exterior");
		
		this.circuloChico = new Circulo(radioInterior,centro);
		this.circuloGrande = new Circulo(radioExterior,centro);
	
	}
	
	public double getRadioInterior() {
		
		return this.circuloChico.getRadio();
		
	}
	
	public double getRadioExterior() {
		return this.circuloGrande.getRadio();
	}
	
	public double getPerimetroInterior() {
		return this.circuloChico.getPerimetro();
	}
	
	public double getPerimetroExterior() {
		return this.circuloGrande.getPerimetro();
	}
	
	public double getSuperficie() {
		return this.circuloGrande.getSuperficie() - this.circuloChico.getSuperficie();
	}
	
	public void setRadioInterior(double ri) {
		if(ri < 0 )
			throw new Error("No se aceptan radios negativos");
		
		if(ri >= this.getRadioExterior())
			throw new Error("El radio interior no debe ser mayor que el exterior");
		
		this.circuloChico.setRadio(ri);
		
	}
	
	public void setRadioExterior(double re) {
		if(re < 0 )
			throw new Error("No se aceptan radios negativos");
		
		if(re <= this.getRadioInterior())
			throw new Error("El radio exterior no debe ser mayor que el interior");
		
		this.circuloGrande.setRadio(re);
	}
	
	public double distancia(DiscoCc d) {
		return this.centro.distancia(d.centro);
	}

}
