package juegoDeEstrategia;

public class TiroDeFlecha implements Movible, Comparable<TiroDeFlecha> {
	
	private Punto punto;

	public TiroDeFlecha(Punto punto) {
		this.punto = punto;
	}
	
	public double distanciaAlCentro() {
		return this.punto.distancia(new Punto(0.0,0.0));
	}

	@Override
	public int compareTo(TiroDeFlecha o) {
		return Double.compare(this.distanciaAlCentro(), o.distanciaAlCentro());
	}

	@Override
	public void mover(double deltaX, double deltaY) {
		// TODO Auto-generated method stub
		
	}

}
