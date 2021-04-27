package juegoDeEstrategia;

public abstract class Unidad implements Movible {

	protected Punto posicion;
	protected int salud;

	public Unidad(Punto posicion, int salud) {
		this.posicion = posicion;
		this.salud = salud;
	}

	public Unidad() {
		this(new Punto(0.0, 0.0), 100);
	}

	public abstract boolean puedeAtacar(Unidad adversario);
	
	public void atacar(Unidad enemigo)
	{
		if(puedeAtacar(enemigo))
		{ 
			enemigo.sufrirDanio(this);
		}	
	}
	
	public boolean estaMuerto() {
		return this.getSalud() <= 0;
	}

	public int getSalud() {
		return salud;
	}
	
	protected void sufrirDanio(Unidad adversario) {
		this.salud -= adversario.getDanioInfingido();
	}

	public abstract int getDanioInfingido();

	
	public double distancia(Unidad adversario) {

		return this.posicion.distancia(adversario.posicion);
	}

	public void mover(double deltaX, double deltaY) {
		this.posicion.mover(deltaX, deltaY);

	}

}
