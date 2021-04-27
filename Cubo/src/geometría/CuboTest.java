package geometría;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CuboTest {

	@Test
	public void inicializoTest() {

		Cubo c = new Cubo(3);
		Assert.assertNotNull(c);

	}
	
	@Test
	public void medirLadoTest() {
		Cubo c = new Cubo(3);
		Assert.assertEquals(3, c.medirLongitudLado(), 0.001);
	}

}
