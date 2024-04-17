package ar.edu.unju.fi.ejercicio12.main;

import java.text.SimpleDateFormat;
import java.util.Calendar;

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
		
		
		fecha2.set(1994, 3, 2);
		
		System.out.println(hoy.getTimeInMillis());
		System.out.println(fecha2.getTimeInMillis()+ "   fecha cumpleaños");
		System.out.println((hoy.getTimeInMillis()-fecha2.getTimeInMillis())/1000/60/60/24/365);
		
		
		
		
	}

}
