package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;

public class Persona {
	private String nombre;
	private static Calendar fechaNacimiento;

	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static int obtenerEdad(Calendar fecha) {
		Calendar hoy = Calendar.getInstance();
		int edad;
		edad = hoy.getInstance().MILLISECOND - fecha.getInstance().MILLISECOND;
		return edad / 1000 / 60 / 60 / 24;
	}

	public String obtenerSignoZodiacal(Calendar fecha) {
		
		return "zs";
	}
}
