package ar.edu.unju.fi.ejercicio17.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc = 0;
		Scanner scan = new Scanner(System.in);
		List<Jugador> jugadores1 = new ArrayList<Jugador>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		do {
			System.out.println("---------MENU------------");
			System.out.println("1 - Alta Jugador");
			System.out.println("2 - Mostrar Datos de Jugador (Nombre y apellido)");
			System.out.println("3 - Mostrar todos los jugadores por apellido");
			System.out.println("4 - Modificar Jugador (Nompre y apellido)");
			System.out.println("5 - Eliminar Jugador (Nombre y apellido)");
			System.out.println("6 - Mostrar Cantidad total de Jugadores");
			System.out.println("7 - Mostrar cantidad de jugadores que pertenecen a una nacionalidad (Nacionalidad)");
			System.out.println("8 - SALIR");
			System.out.println("--------FIN MENU---------");
			System.out.println(" ");

			System.out.println("Ingrese una Opcion");
			opc = scan.nextInt();

			switch (opc) {
			case 1:
				String nombre, apellido, nacionalidad, posicion;
				int dia,mes,anio;
				float peso, altura;
				Calendar fechaCalendar= Calendar.getInstance();
				
				System.out.println("Ingresa Nombre: ");
				nombre = scan.next();
				System.out.println("Ingresa Apellido: ");
				apellido = scan.next();
				System.out.println("Ingresa Nacionalidad: ");
				nacionalidad = scan.next();
				System.out.println("Ingresa Posicion (delantero, medio, defensa, arquero): ");
				posicion = scan.next();
                                                                 
				System.out.println("Ingresa Fecha de nacimiento---- ");
				System.out.println("Ingresa Dia: ");
				dia = scan.nextInt();
				System.out.println("Ingresa Mes: ");
				mes = scan.nextInt();
				System.out.println("Ingresa Año: ");
				anio = scan.nextInt();
				fechaCalendar.set(anio, mes-1, dia);
				
				System.out.println("Ingresa Altura: ");
				altura = scan.nextFloat();
				System.out.println("Ingresa Peso: ");
				peso = scan.nextFloat();

				
				
				jugadores1.add(new Jugador(nombre, apellido, fechaCalendar, nacionalidad, altura, peso, posicion));

				break;
			case 2:
				System.out.println("<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>");
				System.out.println("Ingrese nombre del jugador: ");
				nombre = scan.next();
				System.out.println("Ingrese apellido del jugador: ");
				apellido = scan.next();

				for (Jugador jugador : jugadores1) {
					if (jugador.getApellido().equals(apellido) && jugador.getNombre().equals(nombre)) {
						jugador.toString();
					}
				}
				System.out.println("<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>");
				break;
			case 3:
				System.out.println("<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>");
				List<Jugador> aux= new ArrayList<>();
				aux =jugadores1;
				aux.sort(Comparator.comparing(Jugador::getApellido));
				for (Jugador jugador : aux) {
					System.out.println(jugador.getApellido() + " "+jugador.getNombre());
					
				}
				System.out.println("<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>");
				break;
			case 4:
				System.out.println("<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>");
				System.out.println("Ingrese nombre del jugador: ");
				nombre = scan.next();
				System.out.println("Ingrese apellido del jugador: ");
				apellido = scan.next();
				
				String nombre2, apellido2, nacionalidad2, posicion2;
				int dia2,mes2,anio2;
				float peso2, altura2;
				Calendar fechaCalendar2= Calendar.getInstance();
				
				System.out.println("Ingresa Nuevo Nombre: ");
				nombre2 = scan.next();
				System.out.println("Ingresa Nuevo Apellido: ");
				apellido2 = scan.next();
				System.out.println("Ingresa Nueva Nacionalidad: ");
				nacionalidad2 = scan.next();
				System.out.println("Ingresa Nueva Posicion (delantero, medio, defensa, arquero): ");
				posicion2 = scan.next();
                                                                 
				System.out.println("Ingresa Nueva Fecha de nacimiento---- ");
				System.out.println("Ingresa Nuevo Dia: ");
				dia2 = scan.nextInt();
				System.out.println("Ingresa Nuevo Mes: ");
				mes2 = scan.nextInt();
				System.out.println("Ingresa Nuevo Año: ");
				anio2 = scan.nextInt();
				fechaCalendar2.set(anio2, mes2-1, dia2);
				
				System.out.println("Ingresa Nueva Altura: ");
				altura2 = scan.nextFloat();
				System.out.println("Ingresa Nuevo Peso: ");
				peso2 = scan.nextFloat();
				System.out.println("<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>");
				System.out.println("<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>");
				break;
			case 5:
				System.out.println("<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>");
				System.out.println("Ingrese nombre del jugador a ELIMINAR: ");
				nombre = scan.next();
				System.out.println("Ingrese apellido del jugador a ELIMINAR: ");
				apellido = scan.next();
				
				for (Jugador jugador : jugadores1) {
					if (jugador.getApellido().equals(apellido) && jugador.getNombre().equals(nombre)) {
//						jugador
					}
				}
				
				break;
			case 6:

				break;
			case 7:

				break;
			case 8:

				break;

			default:
				break;
			}
		} while (opc != 8);
	}

}
