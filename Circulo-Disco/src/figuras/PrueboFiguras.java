package figuras;

public class PrueboFiguras {

	public static void main(String[] args) {
		Figura cuadradito = new Cuadrado("Rojo", 4);
		Figura rectangulito = new Rectangulo("Verde", 10, 5);
		Figura triangulito = new Triangulo("Azul", 10, 5);
		Figura circulito = new Circulo("Amarillo", 2);
		
		Figura [] figuras = new Figura[4];
		figuras[0] = cuadradito;
		figuras[3] = rectangulito;
		figuras[2] = triangulito; 
		figuras[1] = circulito; 
		
		for (Figura figura : figuras) {
			System.out.println(figura.getSuperficie());
		}
		
		
//		System.out.println(cuadradito.getSuperficie());//16
//		System.out.println(rectangulito.getSuperficie());//50
//		
//		Figura figurita;
//		figurita = cuadradito;
//		System.out.println(figurita.getColor());		
//		System.out.println(figurita.getSuperficie()); //16
//		System.out.println(figurita);
//		figurita = rectangulito;
//		System.out.println(figurita.getSuperficie());//50
//		
//		System.out.println(figurita.getColor());
//		
//		cuadradito = figurita;
//		System.out.println(figurita.getSuperficie());
//		
//		System.out.println(figurita);
		
		
	
	
	}

}
