package ar.edu.unju.fi.ejercicio09.model;

public class Producto {
	private String nombre;
	private int codigo;
	private double precio;
//	private int descuento = 50; 
	private int descuento = (int) (Math.random()*50); 
	
	public Producto() {
		super();
	}

	public double calcularDescuento() {
		return (this.precio-(this.precio*descuento)/100);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getDescuento() {
		return descuento;
	}
	
	
}
