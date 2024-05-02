package ar.edu.unq.po2.tpsolid;

public class SolicitudHipotecaria extends Solicitud{
	
	private Propiedad propiedad;
	
	public SolicitudHipotecaria(Cliente cliente, double montoSolicitado, int plazo, Propiedad propiedad) {
		this.cliente = cliente;
		this.montoSolicitado = montoSolicitado;
		this.plazo = plazo;
		this.propiedad = propiedad;
	}
	
	public Propiedad getPropiedad() {
		return this.propiedad;
	}
	
	public boolean esAceptable() {
		return (this.getCuotaMensual() <= this.getCliente().getSueldoNetoMensual() * 1.50) 
				& (this.getMontoSolicitado() < this.getPropiedad().getValorFiscal() * 1.70);
	}
}
