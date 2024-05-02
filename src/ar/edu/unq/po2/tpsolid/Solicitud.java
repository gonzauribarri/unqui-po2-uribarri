package ar.edu.unq.po2.tpsolid;



public abstract class Solicitud {
	
	protected Cliente cliente;
	protected double montoSolicitado;
	protected int plazo;
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public double getMontoSolicitado() {
		return montoSolicitado;
	}

	public int getPlazo() {
		return plazo;
	}
	
	public double getCuotaMensual() {
		return this.getMontoSolicitado() / this.getPlazo();
	}
	
	public abstract boolean esAceptable();
}
