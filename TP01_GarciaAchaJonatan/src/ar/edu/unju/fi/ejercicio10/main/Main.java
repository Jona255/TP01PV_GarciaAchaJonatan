package ar.edu.unju.fi.ejercicio10.main;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		
		Pizza[] pizzas = new Pizza[3];

		Pizza pizza1 = new Pizza();

		pizza1.setDiametro(20);
		pizza1.setIngredientesEspeciales(false);
		pizza1.calcularArea();
		pizza1.calcularPrecio();

		System.out.println("la pizza sale: " + pizza1.getPrecio());
		System.out.println("el area es: " + pizza1.getArea());
		
		
		pizza1.setDiametro(40);
		pizza1.setIngredientesEspeciales(true);
		pizza1.calcularArea();
		pizza1.calcularPrecio();
		
		System.out.println("la pizza sale: " + pizza1.getPrecio());
		System.out.println("el area es: " + pizza1.getArea());

		
		System.out.println("-------------------------------------------------");
		System.out.println("Agregue 3 pizzas a continuacion");
		System.out.println("-------------------------------------------------");

		for (int p = 1; p <= 3; p++) {
			Pizza pizza =new Pizza();
			System.out.println("Ingrese el diametro de la pizza");
			pizza.setDiametro(sc.nextInt());
			System.out.println("Quiere ingredientes especiales? (escriba 'true' para si o 'false' para no)");
			pizza.setIngredientesEspeciales(sc.nextBoolean());
			System.out.println("------------SIGUIENTE PIZZA-------------");
			
			pizza.calcularArea();
			pizza.calcularPrecio();;
			pizzas[p-1]=pizza;
			
			if(p==3) {
				System.out.println("-------------------------------------------------");
				System.out.println("");
				System.out.println("");
				System.out.println("Las Pizzas son");
				System.out.println("-------------------------------------------------");
				for (int i = 1; i <= 3; i++) {
					System.out.println("-----------------PIZZA: "+i+" --------------------------");
					System.out.println("**Pizza  " + i);
					System.out.println("Diametro = " + pizzas[i-1].getDiametro());
					System.out.println("Ingredientes Especiales = " + pizzas[i-1].isIngredientesEspeciales());
					System.out.println("Precio Pizza = " + pizzas[i-1].getPrecio()+"$");
					System.out.println("Area de la Pizza: " + pizzas[i-1].getArea());
					System.out.println("-------------------------------------------------");
				}
			}
		}
		
		
		sc.close();
	}

}
