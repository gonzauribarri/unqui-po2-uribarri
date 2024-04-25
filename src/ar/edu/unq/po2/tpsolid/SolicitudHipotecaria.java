package ar.edu.unq.po2.tpsolid;

public class SolicitudHipotecaria extends Solicitud{
	
	private Propiedad propiedad;
	
	public SolicitudHipotecaria(Cliente cliente, double montoSolicitado, int plazo, Propiedad propiedad) {
		super(cliente, montoSolicitado, plazo);
		this.setPropiedad(propiedad);
	}

	private void setPropiedad(Propiedad propiedad) {
		this.propiedad = propiedad;
	}
	
	public Propiedad getPropiedad() {
		return this.propiedad;
	}
}
