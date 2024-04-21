package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	
	private List<Ingreso> ingresos= new ArrayList<Ingreso>();
	
	public void agregarIngreso(Ingreso ingreso) {
		this.ingresos.add(ingreso); 
	}
	
	public double getTotalPercibido() {
		double totalPercibido = 0;
		for(Ingreso ingreso : ingresos) {
			totalPercibido += ingreso.getPercibido();
		}
		return totalPercibido;
	}

	public double getImpuestoAPagar() {
		return this.getMontoImponible() * 0.2;
	}

	public double getMontoImponible() {
		double montoImponible = 0;
		for(Ingreso ingreso : ingresos) {
			montoImponible += ingreso.getMontoImponible();
		}
		return montoImponible;
	}
}
