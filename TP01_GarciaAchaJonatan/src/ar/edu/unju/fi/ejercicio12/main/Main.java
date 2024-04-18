package ar.edu.unju.fi.ejercicio12.main;

import java.text.SimpleDateFormat;

import java.util.Calendar;

import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendario = Calendar.getInstance();
		
		
		System.out.println(calendario.getTime().toLocaleString());  //deprecadisimo
		
		SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println(sdf.format(calendario.getTime()));
		
		calendario.set(2000, 8, 30);
		System.out.println(sdf.format(calendario.getTime()));
		
		calendario.add(Calendar.MONTH, 13);
		System.out.println(sdf.format(calendario.getTime()));
		
		
		Calendar hoy = Calendar.getInstance();
		Calendar fecha2 = Calendar.getInstance();
		
		System.out.println("---------------");
//		fecha2.set(1994, 10, 4);
//		
//		System.out.println(hoy.getTimeInMillis());
//		System.out.println(fecha2.getTimeInMillis()+ "   fecha cumpleaños");
//		System.out.println((hoy.getTimeInMillis()-fecha2.getTimeInMillis())/1000/60/60/24/365);
		
		fecha2.set(1994, 9, 11);
		Persona persona = new Persona("MARTA",fecha2);
		
		System.out.println("EL nombre es: "+persona.getNombre());
		System.out.println("Fecha de Nacimiento es: "+sdf.format(persona.getFechaNacimiento().getTime()));
		System.out.println("La edad es: "+persona.obtenerEdad(fecha2));
		System.out.println("El signo Zodiacal es: "+persona.obtenerSignoZodiacal(fecha2));
		System.out.println("El signo Zodiacal es: "+persona.obtenerSignoZodiacal(fecha2));
		
		
		
		
	}

}
