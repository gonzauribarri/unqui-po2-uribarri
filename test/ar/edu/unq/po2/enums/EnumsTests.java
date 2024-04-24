package ar.edu.unq.po2.enums;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import ar.edu.unq.po2.tpenums.Lesion;

public class EnumsTests {
	private Lesion RED;
	private Lesion YELLOW;
	private Lesion HONEY;
	private Lesion GREY;
	
	@BeforeEach
	public void setUp() {
		RED = Lesion.RED;
		YELLOW = Lesion.YELLOW;
		HONEY = Lesion.HONEY;
		GREY = Lesion.GREY;
	}
	
	@Test
	public void testNext() {
		assertEquals(RED.next(), "Grey");
		assertEquals(YELLOW.next(), "Honey");
		assertEquals(HONEY.next(), "Red");
		assertEquals(GREY.next(), "Yellow");
	}
}
