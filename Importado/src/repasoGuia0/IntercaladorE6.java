package repasoGuia0;
/*Escribir una función que reciba dos arreglos a1 y a2, 
 * de enteros ordenados de mayor a menor e intercale los elementos 
 * de los arreglos que recibe en un nuevo arreglo, tal que el 
 * arreglo resultante también esté ordenado. Por ejemplo:

	a1 = [-5, 0, 0, 1, 5]
	a2 = [-10, 0, 7]
	resultado = [-10, -5, 0, 0, 0, 1, 5, 7]

*/

public class IntercaladorE6 {
	
	public int[] intercalar(int[] a, int[] b) {
		int[] resultado = new int[a.length + b.length];
		int i=0;
		int j=0;
		
		while(i+j < resultado.length) {
			if(i < a.length && (j == b.length || a[i] <= b[j])) {
					resultado[i+j] = a[i];
					i++;
			}
			if(j < b.length && (i == a.length || b[j] <= a[i])) {
					resultado[i+j] = b[j];
					j++;
			}
				
		}
		
		return resultado;
	}
	
	public int[] intercalarOrdenado(int[] a, int[] b) {
		int[] resultado = new int[a.length + b.length];
		int i=0;
		int j=0;
		for(int r=0; r<resultado.length; r++ ) {
			if(i < a.length && j < b.length ) {
				if(a[i] <= b[j] && i<a.length){
					resultado[r] = a[i];
					i++;
				}
				else if(j<b.length){
					resultado[r] = b[j];
					j++;
				}
			}
		}
		for(int r=i+j;r < resultado.length; r++) {
			if(i<a.length) {
				resultado[r] = a[i];
				i++;
			}
			else if(j<b.length){
				resultado[r] = b[j];
				j++;
			}
		}
		return resultado;
	}	

	

}

