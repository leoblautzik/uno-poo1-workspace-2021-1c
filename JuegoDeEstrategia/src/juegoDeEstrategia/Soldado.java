package juegoDeEstrategia;
/*
Reglas del juego:
Los Soldados pueden atacar cuerpo a cuerpo a otros Soldados
si tienen suficiente energía. 
Cada ataque consume 10 puntos de energía, y 
comienzan con 100. Restauran energía si reciben la poción de agua. 
Comienzan con 200 puntos de salud e 
infringen un daño de 10 puntos de salud al adversario.
Ninguna unidad muerta puede atacar, por supuesto.

*/

public class Soldado extends Unidad implements Bebedor{

	private int energia;

	protected static final int DANIO_INFINGIDO = 10;
	private static final int ENERGIA_CONSUMIDA_POR_ATAQUE = 10;

	public Soldado(Punto p) {
		super(p, 200);
		this.energia = 100;
	}

	public Soldado() {
		super(new Punto(0.0, 0.0), 200);
		this.energia = 100;
	}

	public boolean puedeAtacar(Unidad adversario) {
		return tieneSuficienteEnergia() && !estaMuerto() && super.distancia(adversario) <= 1;
	}

	

	public boolean tieneSuficienteEnergia() {

		return this.getEnergia() >= ENERGIA_CONSUMIDA_POR_ATAQUE;
	}

	public void atacar(Unidad adversario) {
		if (this.puedeAtacar(adversario)) {
			this.restarEnergia();
			adversario.sufrirDanio(this);
		}
	}

	public int getDanioInfingido() {
		return Soldado.DANIO_INFINGIDO;
	}

	

	private void restarEnergia() {
		this.energia -= ENERGIA_CONSUMIDA_POR_ATAQUE;
	}

	public int getEnergia() {
		return this.energia;
	}

	public int getSalud() {
		return salud;
	}

	public void beberAgua() {
		this.restaurarEnergia();
	}

	private void restaurarEnergia() {
		this.energia = 100;
		
	}

}
