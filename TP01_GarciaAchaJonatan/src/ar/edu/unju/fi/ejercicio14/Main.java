package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int num,total=0;
		
		do {
			System.out.print("ingrese un numero entre 3 y 10: ");
			num = scan.nextInt(); 			
			
		} while (!(num>2&& num <11));
			
		int[] numeros = new int[num];
		
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("ingrese un numero para almacenar en el indice " + i);
			numeros[i] = scan.nextInt();
		}
//		System.out.println("----------------------------------");
//		
//		System.out.println("Que indice");
//		for(int i = 0;i<numeros.length;i++) {
//			num= scan.nextInt();
//		}

		System.out.println("-------------------");
		for (int i = 0; i < numeros.length; i++) {
			total=total+numeros[i];
			System.out.println("Indice " + i + "----- Numero almacenado: " + numeros[i]);
		}
		System.out.println("La suma total es: " + total);
		
	}

}
