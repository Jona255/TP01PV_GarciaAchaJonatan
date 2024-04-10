package ar.edu.unju.fi.ejercicio05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num, factorial =1;
		
		System.out.println("Ingrese un numero valido entre 1 y 9:");
		num = sc.nextInt();
		
		if (num >= 1 && num <=9 ) {
			System.out.println("Numero ingresado valido: "+num);
			System.out.println("------------TABLA DEL "+num+"------------");


			for (int i = 0; i <= num; i++) {
				int aux=0;
				aux= aux+num*i;
				System.out.println(num + " x "+i+ " = "+aux);
			}
		} else {
			System.out.println("Error, numero ingresado no valido. Vuelva a iniciar el Programa :) ");
		}
		
		
	}

}
