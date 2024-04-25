package ar.edu.unq.po2.tpsolid;

public class Solicitud {
	
	protected Cliente cliente;
	protected double montoSolicitado;
	protected int plazo;
	
	public Solicitud(Cliente cliente, double montoSolicitado, int plazo) {
		this.setCliente(cliente);
		this.setMontoSolicitado(montoSolicitado);
		this.setPlazo(plazo);
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setMontoSolicitado(double montoSolicitado) {
		this.montoSolicitado = montoSolicitado;
	}
	
	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public double getMontoSolicitado() {
		return montoSolicitado;
	}

	public int getPlazo() {
		return plazo;
	}
}
