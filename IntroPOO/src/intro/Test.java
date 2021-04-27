package intro;

public class Test {

public static void main(String[] args) {
		
		Circulo circulin = new Circulo(4,"rojo");
		Circulo circulote = new Circulo(2, "blanco");
		circulin.dibujar();
		circulote.dibujar();
		System.out.println(circulin.obtenerLongitudDeCircunsferencia());
		
		System.out.println(circulote);
		
	}

}
