package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	private float diametro;
	private int precio;
	private float area;
	private boolean ingredientesEspeciales;
	private int ING_ESPECIAL_20 = 500;
	private int ING_ESPECIAL_30 = 750;
	private int ING_ESPECIAL_40 = 1000;

	public Pizza() {
		super();
	}

	public void calcularPrecio() {
		if (this.diametro == 20 && ingredientesEspeciales == false) {
			this.precio = 4500;
		} else if (this.diametro == 20 && ingredientesEspeciales == true) {
			this.precio = 4500 + ING_ESPECIAL_20;
		}

		if (this.diametro == 30 && ingredientesEspeciales == false) {
			this.precio = 4800;
		} else if (this.diametro == 30 && ingredientesEspeciales == true) {
			this.precio = 4800 + ING_ESPECIAL_30;
		}

		if (this.diametro == 40 && ingredientesEspeciales == false) {
			this.precio = 5500;
		} else if (this.diametro == 40 && ingredientesEspeciales == true) {
			this.precio = 5500 + ING_ESPECIAL_40;
		}

	}
	
	
	public void calcularArea() {
		this.area= (float) (Math.PI*(Math.pow(this.diametro, 2))/4);
	}

	public float getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public float getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public boolean isIngredientesEspeciales() {
		return ingredientesEspeciales;
	}

	public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
		this.ingredientesEspeciales = ingredientesEspeciales;
	}
	
	

}
