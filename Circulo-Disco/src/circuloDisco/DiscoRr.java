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

public class DiscoRr {
	
	private double radioInterior;
	private double radioExterior;
	
	
	public DiscoRr(double radioInterior, double radioExterior) {
		if (radioInterior < 0 || radioExterior < 0)
			throw new Error("No se aceptan radios negativos");
		if(radioInterior >= radioExterior)
			throw new Error ("El radio interior debe ser menor que el exterior");
		
		this.radioInterior = radioInterior;
		
		this.setRadioExterior(radioExterior);
	}

	public double getRadioInterior() {
		return this.radioInterior;
		
	}

	public double getRadioExterior() {
		return this.radioExterior;
	}
	
	public double getPerimetroInterior() {
		return this.getRadioInterior() * 2 * Math.PI;
		
	}
	
	public double getPerimetroExterior() {
		return this.getRadioExterior() * 2 * Math.PI;
		
	}
	
	public double getSuperficie() {
		return Math.PI * 
				(Math.pow(this.getRadioExterior(),2) - Math.pow(this.getRadioInterior(),2)); 
		
	}
	
	public void setRadioInterior(double ri) {
		if(ri < 0 )
			throw new Error("No se aceptan radios negativos");
		
		if(ri >= this.getRadioExterior())
			throw new Error("El radio interior no debe ser mayor que el exterior");
		
		this.radioInterior = ri;
		
	}
	
	public void setRadioExterior(double re) {
		if(re < 0 )
			throw new Error("No se aceptan radios negativos");
		
		if(re <= this.getRadioInterior())
			throw new Error("El radio exterior no debe ser mayor que el interior");
		
		this.radioExterior = re;
	}
}

