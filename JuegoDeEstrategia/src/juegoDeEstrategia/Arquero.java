package juegoDeEstrategia;

public class Arquero extends Unidad {
	
	private int flechas = 20;
	private int salud = 50;
		
	private static final int DANIO_INFRINGIDO = 5;
	private static final int FLECHAS_CONSUMIDA_POR_ATAQUE = 1;

	public boolean puedeAtacar() {
		return tieneSuficientesFlechas() && !estaMuerto();
	}

	private boolean tieneSuficientesFlechas() {
		return this.flechas >= 1;
	}

	public boolean estaMuerto() {
		return this.getSalud() <= 0;
	}

	public void atacar(Unidad adversario) {
		if (this.puedeAtacar()) {
			this.restarFlechas();
			adversario.sufrirDanio(this);		
		}				
	}

	private void restarFlechas() {
		this.flechas -= FLECHAS_CONSUMIDA_POR_ATAQUE;
	}
	
	public void recargarFlechas() {
		this.setFlechas(getFlechas()+6);
	} 

	public void setFlechas(int flechas) {
		this.flechas = flechas;
	}

	public int getSalud() {
		return salud;
	}

	public int getFlechas() {
		return flechas;
	}

	@Override
	public boolean puedeAtacar(Unidad adversario) {
		
	        return !estaMuerto() 
	        		&& tieneSuficientesFlechas()
	        		&& super.distancia(adversario)>=2 
	        		&& super.distancia(adversario)<=5;     		
		
	}

	@Override
	public int getDanioInfingido() {
		return Arquero.DANIO_INFRINGIDO;
	}
	
	


}
