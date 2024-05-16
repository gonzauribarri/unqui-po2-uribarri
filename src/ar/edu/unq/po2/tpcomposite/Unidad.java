package ar.edu.unq.po2.tpcomposite;

import ar.edu.unq.po2.tp3.Punto;

public abstract class Unidad implements Personaje{
	
	private Punto ubicacion;
	
	public Unidad(Punto posicionInicial) {
		this.setUbicacion(posicionInicial);
	}

	protected void setUbicacion(Punto posicionInicial) {
		this.ubicacion = posicionInicial;
	}
	
	protected Punto ubicacion(){
		return this.ubicacion;
	}

}
