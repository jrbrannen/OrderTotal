package model;

/**
 * Class calculates discount, tax, shipping and total for the Order class
 * 
 * @author Jeremy Brannen
 *
 */
public class OrderBusLogic {

	double subtotal;
	double discount;
	double shippingCost;
	double tax;
	double total;

	/**
	 * method calculates for discount
	 * 
	 * @param order
	 * @return double discount
	 */
	public double MilitaryDisc(Order order) {
		final double DISCOUNT = .10;

		if (order.isMilitaryDisc() == true) {
			discount = order.getSubTotal() * DISCOUNT;
		} else {
			discount = 0;
		}
		return discount;
	}

	/**
	 * method calculates tax for subtotal after discount is considered
	 * 
	 * @param order
	 * @return double tax
	 */
	public double Tax(Order order) {
		final double TAX_RATE = .06;

		if (order.isTaxExempt() != true) {
			subtotal = order.getSubTotal();
			subtotal -= discount;
			tax = subtotal * TAX_RATE;
		}
		return tax;
	}

	/**
	 * method determines shipping cost based off of number of items purchased
	 * 
	 * @param order
	 * @return double shipping cost
	 */
	public double ShippingCost(Order order) {
		final double LOW_COST = 4.50;
		final double MED_COST = 7.50;
		final double HIGH_COST = 9.75;
		final double LOW_ITEMS = 5;
		final double MED_ITEMS = 10;

		if (order.getItems() <= LOW_ITEMS) {
			shippingCost = LOW_COST;
		} else if (order.getItems() <= MED_ITEMS) {
			shippingCost = MED_COST;
		} else {
			shippingCost = HIGH_COST;
		}
		return shippingCost;

	}

	/**
	 * method calculates the order total
	 * 
	 * @param order
	 * @return double total
	 */
	public double GrandTotal(Order order) {

		subtotal = order.getSubTotal() - MilitaryDisc(order);
		total = subtotal + Tax(order) + ShippingCost(order);
		return total;

	}

}
