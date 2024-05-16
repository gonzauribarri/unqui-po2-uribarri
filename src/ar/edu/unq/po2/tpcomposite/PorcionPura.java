package ar.edu.unq.po2.tpcomposite;

public class PorcionPura implements PorcionDeTierra{
	
	private String cultivo;
	
	public PorcionPura(String cultivo) {
		this.setCultivo(cultivo);
	}

	private void setCultivo(String cultivo) {
		this.cultivo = cultivo;
	}
	
	private String getCultivo() {
		return this.cultivo;
	}
	
	public double getGananciaTotal(String cultivo) {
		if (this.getCultivo() == cultivo) {
			return 500;
		}
		else{
			return 300;
		}
	}
}
