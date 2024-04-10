package ar.edu.unju.fi.ejercicio06.main;

import java.security.DrbgParameters.NextBytes;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio06.model.Persona;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int dni;
		String nombre;
		String fechaNacimiento;
		LocalDate fechaNacLocalDate;
		String provincia;
		

		
		
		Persona persona1 = new Persona();
		persona1.toString();
		System.out.println("-------------------------");
		
		System.out.println("Ingrese DNI: ");
		dni = sc.nextInt();
		System.out.println("Ingrese Nombre: ");
		nombre = sc.next();
		System.out.println("Ingrese la fecha de nacimiento con formato: yyyy-MM-dd");
		fechaNacimiento = sc.next();
		fechaNacLocalDate = LocalDate.parse(fechaNacimiento);
		System.out.println("Ingrese Provincia: ");
		provincia = sc.next();
		
		Persona persona2 = new Persona(dni, nombre, fechaNacLocalDate, provincia);
		persona2.toString();
		System.out.println("-------------------------");
		
		
		System.out.println("Ingrese DNI: ");
		dni = sc.nextInt();
		System.out.println("Ingrese Nombre: ");
		nombre = sc.next();
		System.out.println("Ingrese la fecha de nacimiento con formato: yyyy-MM-dd");
		fechaNacimiento = sc.next();
		fechaNacLocalDate = LocalDate.parse(fechaNacimiento);
		Persona persona3 = new Persona(dni, nombre, fechaNacLocalDate);
		persona3.toString();	
		System.out.println("-------------------------");
		}

}
