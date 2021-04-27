package juegoDeEstrategia;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class SoldadoTest {

	@Test
	public void notNullTest() {
		Soldado rambo = new Soldado();
		Assert.assertNotNull(rambo);
	
	}
	
	@Test
	public void valorInicialEnergiaTest() {
		Soldado rambo = new Soldado();
		int esperado = 100;
		int obtenido = rambo.getEnergia();
		Assert.assertEquals(esperado, obtenido);
	
	}
	
	@Test
	public void valorInicialSaludTest() {
		Soldado rambo = new Soldado();
		int esperado = 200;
		int obtenido = rambo.getSalud();
		Assert.assertEquals(esperado, obtenido);
	
	}
	
	@Test
	public void puedeAtacarInicialTest() {
		Soldado rambo = new Soldado();
		Soldado heman = new Soldado();
		Assert.assertTrue(rambo.puedeAtacar(heman));
	
	}
	@Test
	public void atacarRestaEnergiaTest() {
		Soldado rambo = new Soldado();
		Soldado heman = new Soldado();
		rambo.atacar(heman);
		int esperado = 90;
		int obtenido = rambo.getEnergia();
		Assert.assertEquals(esperado, obtenido);
		
	
	}
	
	@Test
	public void atacarRestaSalud() {
		Soldado rambo = new Soldado();
		Soldado heman = new Soldado();
		rambo.atacar(heman);
		int esperado = 190;
		int obtenido = heman.getSalud();
		Assert.assertEquals(esperado, obtenido);
		
	}
	
	@Test
	public void atacar10VecesSequedaSinEnergiaTest() {
		Soldado rambo = new Soldado();
		Soldado heman = new Soldado();
		for (int i = 0; i < 10; i++) {
			rambo.atacar(heman);
		}
		int esperado = 0;
		int obtenido = rambo.getEnergia();
		Assert.assertEquals(esperado, obtenido);
	
	}
	
	@Test
	public void siAtaca10VecesNoPuedeAtacarTest() {
		Soldado rambo = new Soldado();
		Soldado heman = new Soldado();
		for (int i = 0; i < 10; i++) {
			rambo.atacar(heman);
		}
		Assert.assertFalse(rambo.puedeAtacar(heman));
		
	}
	
	
	@Test
	public void siAtaca10saludAdversarioTest() {
		Soldado rambo = new Soldado();
		Soldado heman = new Soldado();
		for (int i = 0; i < 10; i++) {
			rambo.atacar(heman);
		}
		int esperado = 100;
		int obtenido = heman.getSalud();
		Assert.assertEquals(esperado, obtenido);
			
	}
	@Test
	public void atacaHastaLaMuerteAdversarioTest() {
		Soldado rambo = new Soldado();
		Soldado heman = new Soldado();
		for (int i = 0; i < 20; i++) {
			if(!rambo.tieneSuficienteEnergia())
				rambo.beberAgua();
			rambo.atacar(heman);
		}
		Assert.assertTrue(heman.estaMuerto());
		Assert.assertFalse(rambo.puedeAtacar(heman));
		Assert.assertFalse(heman.puedeAtacar(rambo));
			
	}
	
	@Test
	public void atacar10VecesAunCaballeroSequedaSinEnergiaTest() {
		Unidad rambo = new Soldado();
		Unidad Aragorn = new Caballero(new Punto(0.0,0.0), new Caballo());
		for (int i = 0; i < 10; i++) {
			rambo.atacar(Aragorn);
		}
		
		Assert.assertFalse(rambo.puedeAtacar(Aragorn));
		Assert.assertEquals(100, Aragorn.getSalud());
	
	}
	
	@Test
	public void atacar4VecesCaballoRebeldeTest() {
		Unidad rambo = new Soldado();
		Caballo plata = new Caballo();
		Unidad Aragorn = new Caballero(new Punto(1.0,1.0),plata );
		for (int i = 0; i < 3; i++) {
			Aragorn.atacar(rambo);
		}
		Assert.assertFalse(Aragorn.puedeAtacar(rambo));
		plata.beberAgua();
		Assert.assertTrue(Aragorn.puedeAtacar(rambo));
		
	
	}

	
	
}
