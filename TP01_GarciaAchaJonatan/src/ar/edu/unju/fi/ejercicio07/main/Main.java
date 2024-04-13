package ar.edu.unju.fi.ejercicio07.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio07.model.Empleado;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
 
		
		Scanner sc = new Scanner(System.in);
		String nombre;
		int legajo; 
		double salario;
		
		Empleado empleado; 
		
		System.out.println("Ingrese nombre y apellido: ");
		nombre = sc.nextLine();
		
		System.out.println("Ingrese legajo: ");
		legajo = sc.nextInt();
		
		System.out.println("Ingrese el salario: ");
		salario = sc.nextDouble();
		
		empleado = new Empleado(nombre, legajo, salario);
		System.out.println("------------------------");
		System.out.println("Datos del Empleado");
		empleado.mostrarDatosEmpleado();
		System.out.println("------------------------");
		System.out.println("Aumentando salario");
		empleado.aumentarSalario(true);
		empleado.mostrarDatosEmpleado();
		
		
	}

}
