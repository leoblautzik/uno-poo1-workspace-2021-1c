package repasoGuia0;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int[]a = {-5, 0, 0, 1, 5};
		int[]b = {-10, 0, 7};
		int[]r;
		
						
		IntercaladorE6 ie6 = new IntercaladorE6();
		r = ie6.intercalar(b, a);
		System.out.println(Arrays.toString(r));
		
	}

}
