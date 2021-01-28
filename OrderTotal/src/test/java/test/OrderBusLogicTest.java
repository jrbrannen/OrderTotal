package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import model.Order;
import model.OrderBusLogic;


/**
 * Test class to test methods in OrderBusLogic
 * 
 * @author Jeremy Brannen
 *
 */
public class OrderBusLogicTest {

	OrderBusLogic orderTest = new OrderBusLogic();
	Order order = new Order();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testMilitaryDisc() {
		System.out.println("Inside of testMilitaryDisc()");
		order.setMilitaryDisc("Y");
		order.setSubTotal(75.00);
		double discount = orderTest.MilitaryDisc(order);
		assertEquals(7.50, discount, 0.0);
	}

	@Test
	public void testNoMilitaryDisc() {
		System.out.println("Inside of testNoMilitaryDisc()");
		order.setMilitaryDisc("N");
		order.setSubTotal(75.00);
		double discount = orderTest.MilitaryDisc(order);
		assertEquals(0.00, discount, 0.0);
	}

	@Test
	public void testTaxExempt() {
		System.out.println("Inside of testTaxExempt()");
		order.setTaxExempt("Y");
		order.setSubTotal(96.00);
		double total = orderTest.Tax(order);
		assertEquals(0.00, total, 0.0);
	}

	@Test
	public void testNotTaxExempt() {
		System.out.println("Inside of testNotTaxExemp()");
		order.setTaxExempt("N");
		order.setSubTotal(96.00);
		double total = orderTest.Tax(order);
		assertEquals(5.76, total, 0.0);
	}

	@Test
	public void testShippingCostFiveItems() {
		System.out.println("Inside of testShippingCostFiveItems()");
		order.setItems(5);
		double shipCost = orderTest.ShippingCost(order);
		assertEquals(4.50, shipCost, 0.0);
	}

	@Test
	public void testShippingCostSixItems() {
		System.out.println("Inside of testShippingCostSixItems()");
		order.setItems(6);
		double shipCost = orderTest.ShippingCost(order);
		assertEquals(7.50, shipCost, 0.0);
	}

	@Test
	public void testShippingCostElvenItems() {
		System.out.println("Inside of testShippingCostElvenItems()");
		order.setItems(11);
		double shipCost = orderTest.ShippingCost(order);
		assertEquals(9.75, shipCost, 0.0);
	}

	@Test
	public void testGrandTotal() {
		System.out.println("Inside of testGrandTotal()");
		order.setSubTotal(50.00);
		order.setMilitaryDisc("Y");
		order.setItems(4);
		order.setTaxExempt("N");
		double total = orderTest.GrandTotal(order);
		assertEquals(52.20, total, 0.0);
	}

}
