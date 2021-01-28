package model;

/**
 * Class POJO for Orders
 * 
 * @author Jeremy Brannen
 *
 */
public class Order {

	double subTotal;
	int items;
	String militaryDisc;
	String taxExempt;

	public Order() {
	}

	public Order(double subTotal, int items, String militaryDisc, String taxExempt) {
		this.subTotal = subTotal;
		this.items = items;
		this.militaryDisc = militaryDisc;
		this.taxExempt = taxExempt;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	public int getItems() {
		return items;
	}

	public void setItems(int items) {
		this.items = items;
	}

	/**
	 * get method changes string to boolean
	 * 
	 * @return boolean discount
	 */
	public boolean isMilitaryDisc() {
		boolean discount = false;

		if (militaryDisc.toUpperCase() == "Y") {
			discount = true;
		}
		return discount;
	}

	public void setMilitaryDisc(String militaryDisc) {
		this.militaryDisc = militaryDisc;
	}

	/**
	 * get method changes string to boolean
	 * 
	 * @return boolean discount
	 */
	public boolean isTaxExempt() {
		boolean exempt = false;

		if (taxExempt.toUpperCase() == "Y") {
			exempt = true;
		}
		return exempt;
	}

	public void setTaxExempt(String taxExempt) {
		this.taxExempt = taxExempt;
	}

	@Override
	public String toString() {
		return "Order [subTotal=" + subTotal + ", items=" + items + ", militaryDisc=" + militaryDisc + ", taxExempt="
				+ taxExempt + "]";
	}

}
