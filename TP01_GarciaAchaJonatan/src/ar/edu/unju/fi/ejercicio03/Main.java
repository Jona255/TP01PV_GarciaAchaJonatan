package ar.edu.unju.fi.ejercicio03;

import java.util.Scanner;

/**
 * 
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Ingrese un numero:");
		num = sc.nextInt();
		
		if(num % 2 == 0 && num !=0) {
			num= num*3;
			System.out.println("el numero es par y se triplico: " +num);
		}else {
			
			if (num % 2 != 0) {
				num= num*2;
				System.out.println("el numero es impar y se duplico: " +num);	
			}else {
				System.out.println("el numero es 0");
			}
				
				
			}
		}	
	
}
