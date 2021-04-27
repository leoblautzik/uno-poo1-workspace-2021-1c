package repasoGuia0;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Ejercicio6JUnitTest {
	private IntercaladorE6 e6;
	
	@Before
	public void before() {
		e6 = new IntercaladorE6();		
	}

	@Test
	public void testLeoblau() {
		int [] a = {1,2,3,4,5,6,7};
		int [] b = {1,2,3,4,5,6,7};
		int [] r = {1,1,2,2,3,3,4,4,5,5,6,6,7,7};
		Assert.assertArrayEquals(r, e6.intercalar(a, b));
	}

}
