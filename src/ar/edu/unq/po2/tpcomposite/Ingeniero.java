package ar.edu.unq.po2.tpcomposite;

import ar.edu.unq.po2.tp3.Punto;

public class Ingeniero extends Unidad implements Personaje{
	
	private int lajas;
	
	public Ingeniero(Punto ubicacion, int lajas) {
		super(ubicacion);
		this.setLajas(lajas);
	}

	private void setLajas(int lajas) {
		this.lajas = lajas;
	}
	
	public int getLajas() {
		return this.lajas;
	}
	
	public void mover(Punto destino) {
		if(this.getLajas() > 0) {
			System.out.println("Colocando laja y moviendo");
			this.setLajas(this.getLajas() - 1);
			this.setUbicacion(destino);
		}
	}
}
