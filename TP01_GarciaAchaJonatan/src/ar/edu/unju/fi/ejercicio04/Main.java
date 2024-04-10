package ar.edu.unju.fi.ejercicio04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num, factorial =1;
		
		System.out.println("Ingrese un numero:");
		num = sc.nextInt();
		
		for(int i = 1; i<=num ;i++) {
			factorial=factorial*i;
		//	System.out.println("valor de i: "+ i);
		}
		System.out.println("el factorial es: "+ factorial);
	}

}
