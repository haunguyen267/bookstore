package model.order;

import model.book.Book;
import java.util.ArrayList;
import java.util.Date;
import person.*;


public class Cart {

	private Customer customer;
	private ArrayList<Book> listBook;
	private Date timeMadeCart;
	private int total;

	public Cart() {
		// TODO - implement Cart.Cart
		throw new UnsupportedOperationException();
	}

	public Customer getCustomer() {
		return this.customer;
	}

	/**
	 * 
	 * @param customer
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ArrayList getListBook() {
		// TODO - implement Cart.getListBook
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param listBook
	 */
	public void setListBook(ArrayList listBook) {
		// TODO - implement Cart.setListBook
		throw new UnsupportedOperationException();
	}

	public Date getTimeMadeCart() {
		return this.timeMadeCart;
	}

	/**
	 * 
	 * @param timeMadeCart
	 */
	public void setTimeMadeCart(Date timeMadeCart) {
		this.timeMadeCart = timeMadeCart;
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