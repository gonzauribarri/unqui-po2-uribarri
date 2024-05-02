package ar.edu.unq.po2.tpenums;

import java.util.ArrayList;
import java.util.List;

public class Municipio {
	
	private List<ActividadSemanal> actividades;
	
	public Municipio() {
		this.actividades = new ArrayList<ActividadSemanal>(); 
	}
	
	private List<ActividadSemanal> getActividades(){
		return this.actividades;
	}
	
	public List<ActividadSemanal> getActividadesDe(Deporte deporte){
		return this.getActividades().stream().filter(a -> a.getDeporte() == deporte).toList();
	}
	
	public List<ActividadSemanal> getActividadesDeComplejidad(int complejidad){
		return this.getActividades().stream().filter(a -> a.getDeporte().getComplejidad() == complejidad).toList();
	}
}
