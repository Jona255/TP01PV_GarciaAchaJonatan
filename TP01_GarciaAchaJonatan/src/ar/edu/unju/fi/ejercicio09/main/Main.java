package ar.edu.unju.fi.ejercicio09.main;

import java.util.Iterator;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio09.model.Producto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		
		Producto[] productos = new Producto[3];

		Producto producto1 = new Producto();

		producto1.setNombre("pan");
		producto1.setCodigo(123);
		producto1.setPrecio(500);

		System.out.println("el precio SIN descuento del producto es: " + producto1.getPrecio());
		System.out.println("el PORCENTAJE de descuento es: " + producto1.getDescuento());
		System.out.println("el precio CON descuento del producto es: " + producto1.calcularDescuento());

		
		System.out.println("-------------------------------------------------");
		System.out.println("Agregue 3 productos a continuacion");
		System.out.println("-------------------------------------------------");

		for (int p = 1; p <= 3; p++) {
			Producto producto =new Producto();
			System.out.println("Ingrese el nombre del producto");
			producto.setNombre(sc.next());
			System.out.println("Ingrese el codigo del producto");
			producto.setCodigo(sc.nextInt());
			System.out.println("Ingrese el precio del producto");
			producto.setPrecio(sc.nextDouble());
			System.out.println("------------SIGUIENTE PRODUCTO-------------");
			
			productos[p-1]=producto;
			
			if(p==3) {
				System.out.println("-------------------------------------------------");
				System.out.println("Los productos son");
				System.out.println("-------------------------------------------------");
				for (int i = 1; i <= 3; i++) {
					System.out.println("-----------------Producto: "+i+" --------------------------");
					System.out.println("El producto es: " + productos[i-1].getNombre());
					System.out.println("El Codigo es: " + productos[i-1].getCodigo());
					System.out.println("el precio SIN descuento del producto es: " + productos[i-1].getPrecio());
					System.out.println("el PORCENTAJE de descuento es: " + productos[i-1].getDescuento());
					System.out.println("el precio CON descuento del producto es: " + productos[i-1].calcularDescuento());
					System.out.println("-------------------------------------------------");
				}
			}
		}
		
		
		sc.close();
	}

}
