package ar.edu.unju.fi.ejercicio18.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;
import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {

	public static void main(String[] args) {
		
		int opc = 0;
		Scanner scan = new Scanner(System.in);
		List<DestinoTuristico> destinoTuristicos= new ArrayList<DestinoTuristico>();
		DateTimeFormatter formateadorFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		do {
			System.out.println("---------MENU------------");
			System.out.println("1 - Alta de destino turístico (Ingrese el código de pais");
			System.out.println("2 - Mostrar todos los destinos turísticos");
			System.out.println("3 - Modificar el país de un destino turístico");
			System.out.println("4 - Limpiar el ArrayList de destino turísticos");
			System.out.println("5 - Eliminar un destino turístico (código del destino turístico");
			System.out.println("6 - Mostrar los destinos turísticos ordenados por nombre");
			System.out.println("7 - Mostrar todos los países");
			System.out.println("8 - Mostrar los destinos turísticos que pertenecen a un país (Ingrese código de pais");
			System.out.println("9 - SALIR");
			System.out.println("--------FIN MENU---------");
			System.out.println(" ");

			System.out.println("Ingrese una Opcion");
			opc = scan.nextInt();

			switch (opc) {
			case 1:
				String nombre;
				float precio;
				int codigo, cantDias;
				Pais pais;
				
				Calendar fechaCalendar = Calendar.getInstance();

				System.out.println("Ingresa Nombre: ");
				nombre = scan.next();
				System.out.println("Ingresa Apellido: ");
				apellido = scan.next();
				System.out.println("Ingresa Nacionalidad: ");
				nacionalidad = scan.next();
				System.out.println("Ingresa Posicion (delantero, medio, defensa, arquero): ");
				posicion = scan.next();
				System.out.println("Ingresa Fecha de Nacimiento (dd-MM-aaaa): ");
				fechaNacimiento = scan.next();
				altura = 123;

				LocalDate fechaNac = LocalDate.parse(fechaNacimiento, formateadorFecha);

				System.out.println("Ingresa Altura: ");
				altura = scan.nextFloat();
				System.out.println("Ingresa Peso: ");
				peso = scan.nextFloat();

				// DATOS PARA TESTEAR
//				Jugador jugador1 = new Jugador("Jose", "Quiroga", "Argentina", altura, fechaNac, peso, posicion);
//				Jugador jugador2 = new Jugador("Ricardo", "Tolaba", "Española", altura, fechaNac, peso, posicion);
//				Jugador jugador3 = new Jugador("Federico", "Puca", "Venezolano", altura, fechaNac, peso, posicion);
//				Jugador jugador4 = new Jugador("Cristina", "Milei", "Estadounidense", altura, fechaNac, peso, posicion);
//				Jugador jugador5 = new Jugador("Javier", "Kirchner", "Argentina", altura, fechaNac, peso, posicion);

				jugadores1.add(new Jugador(nombre, apellido, nacionalidad, altura, fechaNac, peso, posicion));
//				jugadores1.add(jugador1);
//				jugadores1.add(jugador2);
//				jugadores1.add(jugador3);
//				jugadores1.add(jugador4);
//				jugadores1.add(jugador5);

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
				List<Jugador> aux = new ArrayList<>();
				aux = jugadores1;
				aux.sort(Comparator.comparing(Jugador::getApellido));
				for (Jugador jugador : aux) {
					System.out.println(jugador.getApellido() + " " + jugador.getNombre());

				}
				System.out.println("<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>");
				break;
				
				
			case 4:
				System.out.println("<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>");
				System.out.println("Ingrese nombre del jugador: ");
				nombre = scan.next();
				System.out.println("Ingrese apellido del jugador: ");
				apellido = scan.next();

//				String nombre2, apellido2, nacionalidad2, posicion2;
//				float peso2, altura2;

				for (int i = 1; i <= jugadores1.size(); i++) {
					if (jugadores1.get(i).getNombre().equals(nombre)
							&& jugadores1.get(i).getApellido().equals(apellido)) {
						
						System.out.println("Ingresa Nuevo Nombre: ");
						jugadores1.get(i).setNombre(scan.next());
						System.out.println("Ingresa Nuevo Apellido: ");
						jugadores1.get(i).setApellido(scan.next());
						System.out.println("Ingresa Nueva Nacionalidad: ");
						jugadores1.get(i).setNacionalidad(scan.next());
						System.out.println("Ingresa Nueva Posicion (delantero, medio, defensa, arquero): ");
						jugadores1.get(i).setPosicion(scan.next());

						System.out.println("Ingresa Nueva Fecha de nacimiento---- ");
						fechaNacimiento = scan.next();
						LocalDate fechaNac1 = LocalDate.parse(fechaNacimiento, formateadorFecha);
						jugadores1.get(i).setFecha(fechaNac1);

						System.out.println("Ingresa Nueva Altura: ");
						jugadores1.get(i).setAltura(scan.nextFloat());
						
						System.out.println("Ingresa Nuevo Peso: ");
						jugadores1.get(i).setPeso(scan.nextFloat());
					}
				}

				System.out.println("<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>");
				System.out.println("<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>");
				break;
			case 5:
				System.out.println("<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>");
				System.out.println("Ingrese nombre del jugador a ELIMINAR: ");
				nombre = scan.next();
				System.out.println("Ingrese apellido del jugador a ELIMINAR: ");
				apellido = scan.next();

				Iterator iterator = jugadores1.iterator();
				while (iterator.hasNext()) {
					Jugador j = (Jugador) iterator.next();
					if (j.getNombre().equals(nombre) && j.getApellido().equals(apellido)) {
						iterator.remove();
						System.out.println("JUGADOR ELIMINADO CORRECTAMENTE");
					} else {
						System.out.println("JUGADOR NO EXISTE - VUELVA A INTENTAR MAS TARDE");
					}

				}

				break;
			case 6:
				System.out.println("La cantidad de jugadores es: " + jugadores1.size());
				break;
			case 7:
				System.out.println("Ingrese Nacionalidad:");
				nacionalidad = scan.next();
				int cant = 0;
				for (Jugador jugador : jugadores1) {
					if (jugador.getNacionalidad() == "Argentina") {
						cant++;
					}
				}
				System.out.println("La cantidad de jugadores es: " + cant);
				break;
			case 8:
				System.out.println("FIN DEL PROGRAMA");
				break;

			default:
				System.out.println("Opcion incorrecta, vuelva a intentar");
				break;
			}
		} while (opc != 8);
		
	}

}
