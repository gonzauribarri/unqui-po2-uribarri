package ar.edu.unq.po2.tpcomposite;

import ar.edu.unq.po2.tp3.Punto;

public class Caballero extends Unidad implements Personaje{

	public Caballero(Punto ubicacion) {
		super(ubicacion);
	}
	
	public void mover(Punto destino) {
		this.setUbicacion(destino);
	}
}
