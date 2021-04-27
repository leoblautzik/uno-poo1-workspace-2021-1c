package holaMundo;

import java.util.Scanner;

public class HolaMundo {

	public static void main(String[] args) {
		int a;
		int b;
		int suma;
		double cociente;

		a = 5;
		b = 8;
		suma = a + b;
		System.out.println(suma);

		a = 13;
		int c = 5;
		cociente = a*1.0/c; //OJO CON LA DIVISIÓN ENTERA!!!
		System.out.println(cociente);

		int fecha;
		int dia;
		int mes;
		int anio;
		Scanner sc = new Scanner(System.in);
		fecha = sc.nextInt();
		anio = fecha/10000;
		mes = (fecha % 10000) / 100;
		dia = (fecha % 100);
		System.out.println(dia + "/" + mes + "/" + anio);











	}

}
