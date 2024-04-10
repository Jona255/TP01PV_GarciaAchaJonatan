package ar.edu.unju.fi.ejercicio06.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Persona {
	private int dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	private String provincia;

//	DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd-MM-yy");
	
	public Persona(){
		super();
		this.dni = 0;
		this.nombre = null;
		this.fechaNacimiento = null;
		this.provincia = null;
	}
	
	
	public Persona(int dni, String nombre, LocalDate fechaNacimiento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = "Jujuy";
	}


	public Persona(int dni, String nombre, LocalDate fechaNacimiento, String provincia) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = provincia;
	}

	
	
	
	
	@Override
	public String toString() {
		System.out.println("El dni es: "+ this.dni);
		System.out.println("el nombre es: "+ this.nombre);
		System.out.println("la fecha de nacimiento es: "+this.fechaNacimiento);
		System.out.println("la provincia de origen es: "+ this.provincia);
		System.out.println("la edad de la persona es: " +this.calcularEdad());
		
		if(this.fechaNacimiento!=null) {
			if(this.esMayorDeEdad()) {			
				System.out.println("La persona es MAYOR de edad");
			}else {
				System.out.println("La persona es MENOR de edad");
			}
		}else {
			System.out.println("No hay edad para corroborar");
		}
		return super.toString();
		
		
	}


	public boolean esMayorDeEdad() {
		if (this.fechaNacimiento!=null) return this.calcularEdad()>=18;
		return false;
		
	}
	public int calcularEdad() {
		if(this.fechaNacimiento!=null) {
			return (int)Period.between(this.fechaNacimiento,LocalDate.now()).getYears();
		}else {
			return 0;
		}
	}
	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechanacimiento() {
		return fechaNacimiento;
	}
	public void setFechanacimiento(LocalDate fechanacimiento) {
		this.fechaNacimiento = fechanacimiento;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

		
}
