package ar.edu.unq.po2.tpenums;

public class ActividadSemanal {
	
	private DiaDeLaSemana dia;
	private int duracion;
	private Deporte deporte;
	
	public ActividadSemanal(DiaDeLaSemana dia, int duracion, Deporte deporte) {
		this.setDia(dia);
		this.setDuracion(duracion);
		this.setDeporte(deporte);
	}
	
	private void setDia(DiaDeLaSemana dia) {
		this.dia = dia;
	}

	private void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	private void setDeporte(Deporte deporte) {
		this.deporte = deporte;
	}
	
	public DiaDeLaSemana getDia(){
		return this.dia;
	}
	
	public int getDuracion(){
		return this.duracion;
	}
	
	public Deporte getDeporte(){
		return this.deporte;
	}
}
