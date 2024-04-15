package ar.edu.unju.fi.ejercicio08.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio08.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		
		CalculadoraEspecial ce = new CalculadoraEspecial();

		
		System.out.println("Ingrese un numero para realizar la sumatoria y productoria:");
		num = sc.nextInt();
		ce.setN(num);
		System.out.println("--------------------------------");
		System.out.println("La sumatoria de "+num+" es: "+ ce.calculadoraSumatoria(ce.getN()));
		System.out.println("La productoria de "+num+" es: "+ ce.calculadoraProductoria(ce.getN()));
		sc.close();
	}	

}
