package ar.edu.unju.fi.ejercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		double num1, num2, num3, num4, num5;
		double promedio;
		num1 = 8;
		num2 = 5;
		num3 = 1;
		num4 = 20;
		num5 = 9;
		
		promedio = (num1+num2+num3+num4+num5)/5;
		
		System.out.println("El promedio es: "+promedio);
	}

}
