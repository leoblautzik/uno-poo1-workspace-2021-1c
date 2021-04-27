package circuloDisco;

public class PrueboCirculo {

	public static void main(String[] args) {
		
		Circulo c1 = new Circulo(4, new Punto(6.0,5.0));
		Circulo c2 = new Circulo(4, new Punto(-6.0,-5.0));
		
		System.out.println(c1.distancia(c2));
		
		
		System.out.println(c1.getDiametro());
		System.out.println(c1.getPerimetro());
		System.out.println(c1.getSuperficie());
		System.out.println(c1.getRadio());
		
		DiscoRr d1 = new DiscoRr(4, 8);
		System.out.println(d1.getPerimetroExterior());
		System.out.println(d1.getPerimetroInterior());
		System.out.println(d1.getSuperficie());
		d1.setRadioInterior(7.9);
		
		System.out.println(d1.getPerimetroExterior());
		System.out.println(d1.getPerimetroInterior());
		System.out.println(d1.getSuperficie());
		
		Punto p1 = new Punto(6.0,5.0);
		Punto p2 = new Punto(3.0,2.0);
		
		double distObj = p1.distancia(p2);
		double distSta = Punto.distancia(p1, p2);
		System.out.println(distObj);
		System.out.println(distSta);

	}

}
