package ar.edu.unq.po2.tp4;

public class IngresoPorHoraExtra extends Ingreso{
	
	private int horasExtra;
	
	public IngresoPorHoraExtra(int mes, String concepto, double percibido, int horasExtra) {
		super(mes, concepto, percibido);
		this.horasExtra = horasExtra;
	}

	public int getHorasExtra() {
		return horasExtra;
	}
	
	@Override
	public double getMontoImponible() {
		return 0;
	}
}
