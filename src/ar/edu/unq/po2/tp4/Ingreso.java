package ar.edu.unq.po2.tp4;

public class Ingreso {
	
	protected int mes;
	protected String concepto;
	protected double percibido;
	
	public Ingreso(int mes, String concepto, double percibido) {
		this.mes = mes;
		this.concepto = concepto;
		this.percibido = percibido;
	}
	
	public int getMes() {
		return mes;
	}

	public String getConcepto() {
		return concepto;
	}

	public double getPercibido() {
		return this.percibido;
	}

	public double getMontoImponible() {
		return this.getPercibido();
	}
}