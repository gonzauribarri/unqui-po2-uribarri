package unq.po2.tp5;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import ar.edu.unq.po2.tp5.CooperativeProduct;
import ar.edu.unq.po2.tp5.CashMachine;
import ar.edu.unq.po2.tp5.Product;

public class CashMachineTest {
	private CashMachine market;
	private Product companyProduct;
	private CooperativeProduct cooperativeProduct;
	
	@BeforeEach
	public void setUp() {
		market = new CashMachine();
		companyProduct = new Product(250, 3);
		cooperativeProduct = new CooperativeProduct(300, 5);
	}
	
	@Test
	public void testRegisterProduct() {
		market.registerPayable(companyProduct);
		market.registerPayable(cooperativeProduct);
		assertEquals(market.getPayables().isEmpty(), false);
		assertEquals(520, market.getTotalAmountToPay());
	}
}