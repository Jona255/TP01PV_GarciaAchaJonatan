package ar.edu.unju.fi.ejercicio15.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int num;
		String cadena="";
		
		do {
			System.out.print("ingrese un numero entre 5 y 10: ");
			num = scan.nextInt(); 			
			
		} while (!(num>4&& num <11));
			
		String[] nombres = new String[num];
		
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("ingrese un numero para almacenar en el indice " + i);
			nombres[i] = scan.next();
		}


		System.out.println("-------------------");
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Indice " + i + "----- nombre almacenado: " + nombres[i]);
		}
		System.out.println("-----------VECTOR REVERSO--------");
		for (int i = nombres.length-1 ; i >=0; i--) {
			System.out.println("Indice " + i + "----- nombre almacenado: " + nombres[i]);
		}
		
	}

}
