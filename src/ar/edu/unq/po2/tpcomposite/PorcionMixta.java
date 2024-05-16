package ar.edu.unq.po2.tpcomposite;

import java.util.ArrayList;
import java.util.List;

public class PorcionMixta implements PorcionDeTierra{
	
	private List<PorcionDeTierra> porciones;  
	
	public PorcionMixta() {
		this.porciones = new ArrayList<PorcionDeTierra>();
	}
	
	public double getGananciaTotal(String cultivo) {
		double gananciasHastaAhora = 0;
		
		for(PorcionDeTierra porcion : porciones) {
			gananciasHastaAhora += porcion.getGananciaTotal(cultivo);
		}
		
		return gananciasHastaAhora;
	}
}
