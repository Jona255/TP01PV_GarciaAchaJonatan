package ar.edu.unju.fi.ejercicio07.model;

import java.text.DecimalFormat;

public class Empleado {
	private String nombre;
	private int legajo;
	private double salario;
	final double SALARIO_MINIMO = 2100000.00;
	final double AUMENTO_MERITO = 20000.00;

	public Empleado(String nombre, int legajo, double salario) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;

		if (this.salario < SALARIO_MINIMO) {
			this.salario = SALARIO_MINIMO;
		} else {
			this.salario = salario;
		}
	}

	public void mostrarDatosEmpleado() {
 		DecimalFormat formatoSalario = new DecimalFormat("#,##0.##");
 		
		System.out.println("Nombre del Empleado: " + this.nombre);
		System.out.println("Legajo: " + this.legajo);
		System.out.println("Salario $: " + formatoSalario.format(this.salario));
	}
	
	public void aumentarSalario(boolean merito) {
		if(merito) {			
			this.salario=this.salario+AUMENTO_MERITO;
		}
	}

}
