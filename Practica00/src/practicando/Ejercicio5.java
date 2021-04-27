package practicando;

import java.util.Arrays;

public class Ejercicio5 {

	public double[][] sumaDeMatricesNxN(double[][] matrizA, double[][] matrizB) {
		double[][] sumatoria = new double[matrizA.length][matrizA.length];

		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA.length; j++) {
				sumatoria[i][j] = matrizA[i][j] + matrizB[i][j];
			}
		}
		return sumatoria;
	}

	private void imprimirMatriz(double[][] matriz) {

		for (int i = 0; i < matriz.length; i++) {
			System.out.print("{");
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(" " + matriz[i][j] + ", ");
			}
			System.out.println("}");
		}
	}

	public double[][] traspuesta(double [][] a){
		
		double[][] t = new double[a.length][a.length];
		
		for (int i = 0; i<a.length; i++){
			
			for(int j = 0; j<a.length; j++){
				
				t[j][i] = a[i][j];
			}
		}
		
		return t;
	} 
	
	public static void main(String[] args) {
		double [][] a = {{3,2,-1} , {4,5,6} , {7,8,9}};
		double [][] b = {{-3,-2,1}, {-4,-5,-6}, {-7, -8, -9}};

		Ejercicio5 e5 = new Ejercicio5();


		double [][] c = e5.sumaDeMatricesNxN(a, b);

		e5.imprimirMatriz(c);

		for(int i = 0 ; i< c.length; i++) {
			System.out.println(Arrays.toString(c[i]));
		}

		//System.out.println(Arrays.deepToString(c));
		
		e5.imprimirMatriz(e5.traspuesta(a));

	}

}
