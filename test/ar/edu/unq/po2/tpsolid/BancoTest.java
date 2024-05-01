package ar.edu.unq.po2.tpsolid;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BancoTest {
	private Banco banco;
	private Cliente tito;
	private Cliente cacho;
	private Propiedad casaReferencia;
	private Solicitud solicitudPersonal;
	private SolicitudHipotecaria solicitudHipotecaria;
	
	@BeforeEach
	public void setUp() {
		this.banco = new Banco("BBVA");
		this.tito = new Cliente("Tito", "Fontevoa", "Brandsen 2010", 20, 25000);
		this.cacho = new Cliente("Cacho", "Fasiuto", "Rivadavia 3000", 30, 45000);
		this.casaReferencia = new Propiedad("Casa de 4 ambientes en la localidad de Quilmes", "Cuelli 3835", 80000);
		this.solicitudPersonal = new SolicitudPersonal(tito, 3000, 20);
		this.solicitudHipotecaria = new SolicitudHipotecaria(cacho, 2500, 30, casaReferencia);
	}
	
	@Test
	public void testCreandoBanco() {
		assertEquals("BBVA", this.banco.getNombre());
	}
}
