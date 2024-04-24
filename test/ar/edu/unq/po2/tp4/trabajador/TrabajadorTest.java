package ar.edu.unq.po2.tp4.trabajador;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ar.edu.unq.po2.tp4.Ingreso;
import ar.edu.unq.po2.tp4.IngresoPorHoraExtra;
import ar.edu.unq.po2.tp4.Trabajador;

public class TrabajadorTest {
	private Trabajador trabajador;
	private Ingreso ingresoComun;
	private IngresoPorHoraExtra ingresoHoraExtra;
	
	@BeforeEach
	public void setUp() {
		trabajador = new Trabajador();
		ingresoComun = new Ingreso(2, "Salario", 30000);
		ingresoHoraExtra = new IngresoPorHoraExtra(3, "Aguinaldo", 2000, 2);
	}
	
	@Test
	public void testTotalPercibido() {
		trabajador.agregarIngreso(ingresoComun);
		trabajador.agregarIngreso(ingresoHoraExtra);
		assertEquals(32000, trabajador.getTotalPercibido());
	}
	
	@Test
	public void testMontoImponible() {
		trabajador.agregarIngreso(ingresoComun);
		trabajador.agregarIngreso(ingresoHoraExtra);
		assertEquals(30000, trabajador.getMontoImponible());
	}
	
	@Test
	public void testImpuestoAPagar() {
		trabajador.agregarIngreso(ingresoComun);
		trabajador.agregarIngreso(ingresoHoraExtra);
		assertEquals(6000, trabajador.getImpuestoAPagar());
	}
}
