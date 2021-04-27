package repasoGuia0;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntercalarOrdenadoTest {

	private IntercaladorE6 ejercicio;
	
	@Before
	public void before() {
		ejercicio = new IntercaladorE6();
	}
	
	@Test
	public void testEnunciado() {
		int[] a = {-5, 0, 0, 1, 5};
		int[] b = {-10, 0, 7};
		int[] r = {-10, -5, 0, 0, 0, 1, 5, 7};
		
		Assert.assertArrayEquals(r, ejercicio.intercalarOrdenado(a, b));
	}
	
	@Test
	public void testEnunciadoInvertido() {
		int[] a = {-5, 0, 0, 1, 5};
		int[] b = {-10, 0, 7};
		int[] r = {-10, -5, 0, 0, 0, 1, 5, 7};
		
		Assert.assertArrayEquals(r, ejercicio.intercalarOrdenado(b, a));
	}
	
	@Test
	public void testOtraPrueba() {
		int[] a = {-10, -4, -3, -1, 0, 4, 7, 20, 24, 38};
		int[] b = {-24, -2, 4, 4, 6, 7, 8, 12, 24};
		int[] r = {-24, -10, -4, -3, -2, -1, 0, 4, 4, 4, 6, 7, 7, 8, 12, 20, 24, 24, 38};
		
		Assert.assertArrayEquals(r, ejercicio.intercalarOrdenado(a, b));
	}
	
	@Test
	public void primeroMenor() {
		int[] a = {1};
		int[] b = {2};
		int[] r = {1, 2};
		
		Assert.assertArrayEquals(r, ejercicio.intercalarOrdenado(a, b));
	}
	
	@Test
	public void segundoMenor() {
		int[] a = {2};
		int[] b = {1};
		int[] r = {1, 2};
		
		Assert.assertArrayEquals(r, ejercicio.intercalarOrdenado(a, b));
	}
	
	@Test
	public void repetidos() {
		int[] a = {1};
		int[] b = {1};
		int[] r = {1, 1};
		
		Assert.assertArrayEquals(r, ejercicio.intercalarOrdenado(a, b));
	}
	
	@Test
	public void arregloVacio() {
		int[] a = {1, 2};
		int[] b = {};
		int[] r = {1, 2};
		
		Assert.assertArrayEquals(r, ejercicio.intercalarOrdenado(a, b));
	}
	
	@Test
	public void ambosArreglosVacios() {
		int[] a = {};
		int[] b = {};
		int[] r = {};
		
		Assert.assertArrayEquals(r, ejercicio.intercalarOrdenado(a, b));
	}

}
