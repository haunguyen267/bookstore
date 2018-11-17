package model.order;

import model.payment.PaymentMethod;
import model.payment.*;

public class Order {

	private Cart cart;
	private PaymentMethod paymentMethod;
	private DiscountCode discountCode;
	private Shipping shipping;
	private int total;

	public Order() {
		// TODO - implement Order.Order
		throw new UnsupportedOperationException();
	}

	public Cart getCart() {
		return this.cart;
	}

	/**
	 * 
	 * @param cart
	 */
	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public PaymentMethod getPaymentMethod() {
		return this.paymentMethod;
	}

	/**
	 * 
	 * @param paymentMethod
	 */
	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public DiscountCode getDiscountCode() {
		return this.discountCode;
	}

	/**
	 * 
	 * @param discountCode
	 */
	public void setDiscountCode(DiscountCode discountCode) {
		this.discountCode = discountCode;
	}

	public Shipping getShipping() {
		return this.shipping;
	}

	/**
	 * 
	 * @param shipping
	 */
	public void setShipping(Shipping shipping) {
		this.shipping = shipping;
	}

	public int getTotal() {
		return this.total;
	}

	/**
	 * 
	 * @param total
	 */
	public void setTotal(int total) {
		this.total = total;
	}



}