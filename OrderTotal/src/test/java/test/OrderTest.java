package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import model.Order;

/**
 * Test class to test methods in OrderTotal Class
 * 
 * @author Jeremy Brannen
 *
 */
public class OrderTest {

	Order order = new Order();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIsMilitaryDiscTrue() {
		order.setMilitaryDisc("Y");
		assertTrue(order.isMilitaryDisc());
	}

	@Test
	public void testIsMilitaryDiscFalse() {
		order.setMilitaryDisc("N");
		order.isMilitaryDisc();
		assertFalse(order.isMilitaryDisc());
	}

	@Test
	public void testIsTaxExempt() {
		order.setTaxExempt("Y");
		assertTrue(order.isTaxExempt());
	}

	@Test
	public void testIsNotTaxExempt() {
		order.setTaxExempt("N");
		assertFalse(order.isTaxExempt());
	}

}
