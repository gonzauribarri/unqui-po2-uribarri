package ar.edu.unq.po2.tpsolid;

public class SolicitudPersonal extends Solicitud {
	
	public SolicitudPersonal(Cliente cliente, double montoSolicitado, int plazo) {
		this.cliente = cliente;
		this.montoSolicitado = montoSolicitado;
		this.plazo = plazo;
	}
	
	public boolean esAceptable(){
		return false;
	}
}
