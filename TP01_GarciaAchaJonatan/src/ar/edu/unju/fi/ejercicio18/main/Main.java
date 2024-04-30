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
		List<DestinoTuristico> destinosTuristicos = new ArrayList<DestinoTuristico>();
		List<Pais> paises = new ArrayList<Pais>();

		Pais pais1 = new Pais(1, "argentina");
		Pais pais2 = new Pais(2, "chile");
		Pais pais3 = new Pais(3, "brasil");
		Pais pais4 = new Pais(4, "uruguay");

		paises.add(pais1);
		paises.add(pais2);
		paises.add(pais3);
		paises.add(pais4);

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
				String nombrePais, nombreDestino;
				float precio;
				int codigoPais, codigoDestino, cantDias;
				Pais pais;

				
				
				System.out.println("Codigo: 1 - Nombre argentina");
				System.out.println("Codigo: 2 - Nombre chile: ");
				System.out.println("Codigo: 3 - Nombre brasil: ");
				System.out.println("Codigo: 4 - Nombre uruguay: ");
				System.out.println("-------------");
				System.out.println("Ingresa Codigo del Pais: ");
				codigoPais = scan.nextInt();
				System.out.println("Ingresa Nombre del Pais: ");
				nombrePais = scan.next();
				
				for (Pais p: paises) {
					if (codigoPais == p.getCodigo() && nombrePais.equals(nombrePais)) {
						pais = new Pais(codigoPais, nombrePais);						
						System.out.println("Ingresa Codigo del Destino: ");
						codigoDestino = scan.nextInt();
						System.out.println("Ingresa Nombre del Destino: ");
						nombreDestino = scan.next();
						
						System.out.println("Ingrese Precio: ");
						precio = scan.nextFloat();
						System.out.println("Ingrese Cantidad de dias: ");
						cantDias = scan.nextInt();
						
						destinosTuristicos.add(new DestinoTuristico(codigoDestino, nombreDestino, precio, pais, cantDias));
					}else{
					}
					
				}


				break;
			case 2:
				System.out.println("<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>");
				for (DestinoTuristico dt : destinosTuristicos) {
					dt.toString();
					System.out.println("\\\\\\\\\\\\\\\\\\\\\\///////////////////");
				}
				System.out.println("<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>");
				break;
			case 3:

				System.out.println("<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>");
				System.out.println("Ingrese nombre del destino turistico: ");
				nombreDestino = scan.next();
				System.out.println("Ingrese nombre nuevo del pais: ");
				nombrePais = scan.next();
				System.out.println("Ingrese codigo nuevo del pais: ");
				codigoPais = scan.nextInt();

				for (int i = 1; i <= destinosTuristicos.size(); i++) {
					if (destinosTuristicos.get(i).getNombre().equals(nombreDestino)) {
						destinosTuristicos.get(i).getPais().setNombre(nombrePais);
						destinosTuristicos.get(i).getPais().setCodigo(codigoPais);
					} else {
						System.out.println("NOMBRE DE DESTINO INCORRECTO");
						break;
					}
				}

				System.out.println("<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>");
				System.out.println("<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>");
				break;

			case 4:

				System.out.println("<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>");
				System.out.println("ELIMINANDO TODOS LOS DESTINOS TURISTICOS");

				destinosTuristicos = new ArrayList<DestinoTuristico>();
				break;

			case 5:
				System.out.println("<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>");
				System.out.println("Ingrese nombre del destino a ELIMINAR: ");
				nombreDestino = scan.next();

				Iterator<DestinoTuristico> iterator = destinosTuristicos.iterator();
				while (iterator.hasNext()) {
					DestinoTuristico destino = (DestinoTuristico) iterator.next();
					if (destino.getNombre().equals(nombreDestino)) {
						iterator.remove();
						System.out.println("DESTINO ELIMINADO CORRECTAMENTE");
					} else {
						System.out.println("DESTINO NO EXISTE - VUELVA A INTENTAR MAS TARDE");
					}

				}

				System.out.println("<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>");
				break;

			case 6:

				System.out.println("<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>");
				List<DestinoTuristico> aux = new ArrayList<DestinoTuristico>();
				aux = destinosTuristicos;
				aux.sort(Comparator.comparing(DestinoTuristico::getNombre));
				for (DestinoTuristico dt : aux) {
					System.out.println(dt.toString());
				}
				System.out.println("<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>");
				break;

			case 7:
				System.out.println("<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>");
				for (DestinoTuristico dt : destinosTuristicos) {
					dt.getPais().toString();
					System.out.println("\\\\\\\\\\\\\\\\\\\\\\///////////////////");
				}
				System.out.println("<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>");
				break;
			case 8:

				System.out.println("<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>");
				System.out.println("Ingrese codigo de pais: ");
				codigoPais = scan.nextInt();
				for (Pais p: paises) {
					if (codigoPais== p.getCodigo() ) {
						for (DestinoTuristico dt: destinosTuristicos) {							
							dt.toString();
						}
					}
					System.out.println("\\\\\\\\\\\\\\\\\\\\\\///////////////////");
				}
				System.out.println("<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>");
				break;

			default:
				System.out.println("Opcion incorrecta, vuelva a intentar");
				break;
			}
		} while (opc != 8);

	}

}
