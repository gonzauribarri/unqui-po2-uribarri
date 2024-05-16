package ar.edu.unq.po2.tpcomposite;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tp3.Punto;

public class Armada extends Unidad implements Personaje{

	private List<Personaje> unidades;	
	
	public Armada(Punto ubicacion) {
		super(ubicacion);
		this.unidades = new ArrayList<Personaje>();
	}
	
	public void mover(Punto destino) {
		for(Personaje unidad : unidades) {
			unidad.mover(destino);
		}
	}
}
