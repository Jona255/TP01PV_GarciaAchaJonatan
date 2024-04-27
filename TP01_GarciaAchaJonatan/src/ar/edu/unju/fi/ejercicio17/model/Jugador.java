package ar.edu.unju.fi.ejercicio17.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Jugador {
	private String nombre;
	private String apellido;
	private Calendar fechaNacimiento;
	private String nacionalidad;
	private float altura;
	private float peso;
	private String posicion;
	
	
	public Jugador(String nombre, String apellido, Calendar fechaNacimiento, String nacionalidad, float altura,
			float peso, String posicion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
		this.altura = altura;
		this.peso = peso;
		this.posicion = posicion;
	}
	
	public int obtenerEdad(Calendar fecha) {	
		return (int) ((Calendar.getInstance().getTimeInMillis()-fecha.getTimeInMillis())/1000/60/60/24/365);
	}
	
	
	
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Apellido: "+this.apellido);
		System.out.println("Fecha de Nacimiento: "+sdf.format(this.fechaNacimiento.getTime()));
		System.out.println("Edad: "+obtenerEdad(this.fechaNacimiento));
		System.out.println("Nacionalidad: "+this.nacionalidad);
		System.out.println("Altura: "+this.altura);
		System.out.println("Peso: "+this.peso);
		System.out.println("Posicion: "+this.posicion);
		return super.toString();
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	
}
