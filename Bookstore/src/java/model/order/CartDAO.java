package model.order;

import java.util.ArrayList;

public interface CartDAO {

	/**
	 * 
	 * @param Item
	 */
	void addToCart(int Item);

	/**
	 * 
	 * @param Item
	 */
	void removeFromCart(int Item);

	/**
	 * 
	 * @param Cart
	 */
	void addCart(int Cart);

	/**
	 * 
	 * @param Cart
	 */
	void deleteCart(int Cart);

	/**
	 * 
	 * @param Cart
	 */
	void updateCart(int Cart);

	ArrayList getAllCart();

}