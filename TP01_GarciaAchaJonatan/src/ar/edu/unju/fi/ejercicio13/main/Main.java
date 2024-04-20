package ar.edu.unju.fi.ejercicio13.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros= new int[8];
		Scanner scan = new Scanner(System.in);
		
		
		for(int i = 0;i<numeros.length;i++) {
			System.out.println("ingrese un numero para almacenar en el indice "+i);
			numeros[i]=scan.nextInt();
		}
//		System.out.println("----------------------------------");
//		
//		System.out.println("Que indice");
//		for(int i = 0;i<numeros.length;i++) {
//			num= scan.nextInt();
//		}
		
		System.out.println("-------------------");
		for(int i = 0;i<numeros.length;i++) {
			System.out.println("Indice "+i +"----- Numero almacenado: "+numeros[i]);
		}
	}

}
