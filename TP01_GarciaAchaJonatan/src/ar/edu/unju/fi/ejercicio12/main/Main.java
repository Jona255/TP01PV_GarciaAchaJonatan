package ar.edu.unju.fi.ejercicio12.main;

import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar fechaNacimiento = Calendar.getInstance();
		Scanner scan = new Scanner(System.in);
		String nombre;
		
		
		
		
		int dia,mes,anio;
//		System.out.println(calendario.getTime().toLocaleString());  //deprecadisimo
		
//		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
//		SimpleDateFormat formatoSalida =new SimpleDateFormat("dd/MM/yyyy");
//		
//		System.out.println(sdf.format(calendario.getTime()));
//		
//		calendario.set(2000, 8, 30);
//		System.out.println(sdf.format(calendario.getTime()));
//		
//		calendario.add(Calendar.MONTH, 13);
//		System.out.println(sdf.format(calendario.getTime()));
//		
//		
//		Calendar hoy = Calendar.getInstance();
//		Calendar fecha2 = Calendar.getInstance();
		
//		System.out.println("---------------");
//		fecha2.set(1994, 10, 4);
//		
//		System.out.println(hoy.getTimeInMillis());
//		System.out.println(fecha2.getTimeInMillis()+ "   fecha cumpleaños");
//		System.out.println((hoy.getTimeInMillis()-fecha2.getTimeInMillis())/1000/60/60/24/365);
		
		
		System.out.println("Ingrese su nombre: ");
		nombre= scan.next();
		System.out.println("Ingrese año de nacimiento:");
		anio= scan.nextInt();
		System.out.println("Ingrese mes de nacimiento:");
		mes= scan.nextInt();
		System.out.println("Ingrese dia de nacimiento:");
		dia = scan.nextInt();
		fechaNacimiento.set(anio, mes, dia);
//		fecha2.set(1994, 9, 11);
		
		
		System.out.println("----------------Los datos de la personas son--------------");
		Persona persona = new Persona(nombre, fechaNacimiento );
		
//		System.out.println("Fecha de Nacimiento es: "+formatoSalida.format(persona.getFechaNacimiento().getTime()));
//		System.out.println("Fecha de Nacimiento es: "+persona.mostrarFechaNacimiento());
		
		System.out.println("EL nombre es: "+persona.getNombre());
		System.out.println(persona.mostrarFechaNacimiento());
		System.out.println("La edad es: "+persona.obtenerEdad(fechaNacimiento));
		System.out.println("El signo Zodiacal es: "+persona.obtenerSignoZodiacal(fechaNacimiento));
		System.out.println("La estacion es: "+persona.obtenerEstacion());
		
		
		
		
	}

}
