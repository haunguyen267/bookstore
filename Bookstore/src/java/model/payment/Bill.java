package model.payment;

import java.util.Date;
import model.order.Order;
import order.*;

public class Bill {

	private Order order;
	private Date timeMadeBill;

	public Bill() {
		// TODO - implement Bill.Bill
		throw new UnsupportedOperationException();
	}

	public Date getTimeMadeBill() {
		return this.timeMadeBill;
	}

	public Order getOrder() {
		return this.order;
	}

	/**
	 * 
	 * @param order
	 */
	public void setOrder(Order order) {
		this.order = order;
	}

	/**
	 * 
	 * @param timeMadeBill
	 */
	public void setTimeMadeBill(Date timeMadeBill) {
		this.timeMadeBill = timeMadeBill;
	}

}