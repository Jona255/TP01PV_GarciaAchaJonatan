package ar.edu.unju.fi.ejercicio16.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String [] nombres = new String [5];
		int opcion;
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.print("ingrese un nombre: ");
			nombres[i] = scan.next(); 			
		} 
		int j=0;
		while (j<5) {
			System.out.println("nombre"+(j)+": "+nombres[j]);
			j++;
		}
		System.out.println("EL TAMAÑO DEL ARREGLO ES "+nombres.length);
		
		do {
			System.out.print("ingrese un numero entre 0 y 4: ");
			opcion = scan.nextInt(); 			
			
		} while (!(opcion>=0&& opcion <5));
		
		
		
		for (int i = 0; i < nombres.length; i++) {
			String aux="";
			if (opcion==nombres.length-1&& i==nombres.length-1) {
				nombres[i]="";

			} else if (opcion==i) {
				for (int k = opcion; k+1 < nombres.length; k++) {
					nombres[k]= nombres[k+1];
					System.out.println("nombre"+(k)+": "+nombres[k]);
				}
				nombres[nombres.length-1]="";
			}
//			System.out.print("ingrese un nombre: ");
//			nombres[i] = scan.next(); 			
		} 
		
		
		System.out.println("------------------------------");
		int k=0;
		while (k<5) {
			System.out.println("nombre"+(k)+": "+nombres[k]);
			k++;
		}
		scan.close();
	}
	

}
