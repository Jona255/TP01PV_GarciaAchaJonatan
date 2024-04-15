package ar.edu.unju.fi.ejercicio08.model;

public class CalculadoraEspecial {
	private int n;

	public CalculadoraEspecial() {
		super();
	}

	public long calculadoraSumatoria(int num) {
		long sumatoria = 0;
		for (int k = 1; k <= num; k++) {
			sumatoria = (long) (sumatoria + Math.pow(((k * (k + 1)) / 2), 2));
		}
		return sumatoria;
	}

	public long calculadoraProductoria(int num) {
		long productoria = 1;
		for (int k = 1; k <= num; k++) {
			productoria = productoria * (k * (k + 4));
		}
		return productoria;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

}
