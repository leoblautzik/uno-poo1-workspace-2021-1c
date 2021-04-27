package juegoDeEstrategia;

public class Caballero extends Unidad {
	
	private static final int DANIO_INFRINGIDO = 50; 
	private Caballo caballo;

	public Caballero(Punto posicion, Caballo caballo) {
		super(posicion, 200);
		this.caballo = caballo;
	}

	@Override
	public void atacar(Unidad adversario) {
		if(this.puedeAtacar(adversario)) {
			this.caballo.incrementarAtaques();
			adversario.sufrirDanio(this);
		}
	}

	@Override
	public int getDanioInfingido() {
		return Caballero.DANIO_INFRINGIDO;
	}
	
	@Override
	public boolean puedeAtacar(Unidad adversario) {
		/*pueden atacar a una distancia de 1 a 2, 
		 siempre que su caballo no se haya puesto rebelde. 
		*/
		return !(this.estaMuerto()) 
				&& this.distancia(adversario)<=2 
				&& this.distancia(adversario)>=1
				&& !(this.caballo.estaRebelde());
		
	}

}
