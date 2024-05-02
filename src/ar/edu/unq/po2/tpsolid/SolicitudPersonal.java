package ar.edu.unq.po2.tpsolid;

public class SolicitudPersonal extends Solicitud {
	
	public SolicitudPersonal(Cliente cliente, double montoSolicitado, int plazo) {
		this.cliente = cliente;
		this.montoSolicitado = montoSolicitado;
		this.plazo = plazo;
	}
	
	public boolean esAceptable(){
		return (this.getCliente().getSueldoNetoAnual() >= 15000) 
				& (this.getCuotaMensual() <= this.getCliente().getSueldoNetoMensual() * 1.70);
	}
}
