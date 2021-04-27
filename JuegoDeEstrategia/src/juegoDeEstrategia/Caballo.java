package juegoDeEstrategia;

public class Caballo implements Bebedor {

	private int ataques = 0;//3

	@Override
	public void beberAgua() {
		this.seCalma();

	}

	public boolean estaRebelde() {
		return (this.ataques >= 3);
	}

	public void seCalma() {
		this.ataques = 0;
	}
	
	public void incrementarAtaques() {
		this.ataques ++;
	}

}
