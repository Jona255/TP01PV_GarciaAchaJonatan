package ar.edu.unju.fi.ejercicio12.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Persona {
	private String nombre;
	private static Calendar fechaNacimiento;

	public Persona(String nombre, Calendar fecha) {
		super();
		this.nombre =nombre;
		this.fechaNacimiento= fecha;
		// TODO Auto-generated constructor stub
	}

	public static long obtenerEdad(Calendar fecha) {
		Calendar hoy = Calendar.getInstance();
		return (hoy.getTimeInMillis() - fecha.getTimeInMillis()) / 1000 / 60 / 60 / 24/365;
	}

	
	public String obtenerEstacion() {
//		SimpleDateFormat monthFormat =new SimpleDateFormat("M");
//		SimpleDateFormat dayFormat =new SimpleDateFormat("d");
//		
//		switch (Integer.parseInt(monthFormat.format(this.fechaNacimiento.getTime()))) {
//		case 1: {
//			
//			return ;
//		}
//		default:
//			throw new IllegalArgumentException("Unexpected value: " + key);
//		}
		return "";
	}
	public String obtenerSignoZodiacal(Calendar fecha) {
		SimpleDateFormat yearFormat =new SimpleDateFormat("yyyy");
		SimpleDateFormat monthFormat =new SimpleDateFormat("M");
		SimpleDateFormat dayFormat =new SimpleDateFormat("d");

		String signo =" ";
//		System.out.println("el mes es: "+ monthFormat.format(fecha.getTime()));
//		System.out.println("el dia es: "+ dayFormat.format(fecha.getTime()));
//		System.out.println("el año es: "+ yearFormat.format(fecha.getTime()));
		
		int dia = Integer.parseInt(dayFormat.format(fecha.getTime()));
		int mes = Integer.parseInt(monthFormat.format(fecha.getTime()));
		switch (mes-1) {
			case 0: {
				if( dia>= 1 && dia<=19) {
					signo= " Capricornio";
				}else if(dia>=20 && dia<=31) {
					signo= " Acuario";					
				}
				break;
			}
			case 1: {
				if(dia>=1 && dia<=18) {
					signo= " Acuario";
				}else if(dia>=19 && dia<=31) {
					signo= " Piscis";					
				}
				break;
			}
			case 2: {
				if(dia>=1 && dia<=20) {
					signo= " Piscis";
				}else if(dia>=21 && dia<=31) {
					signo= " Aries";					
				}
				break;
			}
			case 3: {
				if(dia>=1 && dia<=19) {
					signo= " Aries";
				}else if(dia>=20 && dia<=31) {
					signo= " Tauro";					
				}
				break;
			}
			case 4: {
				if(dia>=1 && dia<=20) {
					signo= " Tauro";
				}else if(dia>=21 && dia<=31) {
					signo= " Geminis";					
				}
				break;
			}
			case 5: {
				if(dia>=1 && dia<=20) {
					signo= " Geminis";
				}else if(dia>=21 && dia<=31) {
					signo= " Cancer";					
				}
				break;
			}
			case 6: {
				if(dia>=1 && dia<=22) {
					signo= " Cancer";
				}else if(dia>=23 && dia<=31) {
					signo= " Leo";					
				}
				break;
			}
			case 7: {
				if(dia>=1 && dia<=22) {
					signo= " Leo";
				}else if(dia>=23 && dia<=31) {
					signo= " Virgo";					
				}
				break;
			}
			case 8: {
				if(dia>=1 && dia<=22) {
					signo= " VIrgo";
				}else if(dia>=23 && dia<=31) {
					signo= " Libra";					
				}
				break;
			}
			case 9: {
				if(dia>=1 && dia<=22) {
					signo= " Libra";
				}else if(dia>=23 && dia<=31) {
					signo= " Escorpio";					
				}
				break;
			}
			case 10: {
				if(dia>=1 && dia<=21) {
					signo= " Escorpio";
				}else if(dia>=22 && dia<=31) {
					signo= " Sagitario";					
				}
				break;
			}
			case 11: {
				if(dia>=1 && dia<=21) {
					signo= " Sagitario";
				}else if(dia>=22 && dia<=31) {
					signo= " Capricornio";					
				}
				break;
			}
			
			default:{
				System.out.println("-------error-----");
			break;
			}
		}
		return signo;
		
	}

	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}

	public static void setFechaNacimiento(Calendar fechaNacimiento) {
		Persona.fechaNacimiento = fechaNacimiento;
	}

	
}
