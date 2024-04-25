package ar.edu.unq.po2.tpsolid;

public class Propiedad {
	
	private String descripcion;
	private String direccion;
	private double valorFiscal;
	
	public Propiedad(String descripcion, String direccion, double valorFiscal) {
		this.setDescripcion(descripcion);
		this.setDireccion(direccion);
		this.setValorFiscal(valorFiscal);
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public void setValorFiscal(double valorFiscal) {
		this.valorFiscal = valorFiscal;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	public String getDireccion() {
		return direccion;
	}

	public double getValorFiscal() {
		return valorFiscal;
	}
}
