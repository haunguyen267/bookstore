package order;

import java.util.ArrayList;

public interface OrderDAO {

	/**
	 * 
	 * @param String
	 */
	ArrayList searchOrder(int String);

	/**
	 * 
	 * @param Order
	 */
	void addOrder(int Order);

	/**
	 * 
	 * @param Order
	 */
	void updateOrder(int Order);

	/**
	 * 
	 * @param Order
	 */
	void removeOrder(int Order);

	/**
	 * 
	 * @param DiscountCode
	 */
	float checkDiscount(int DiscountCode);

	void getAllOrder();

	/**
	 * 
	 * @param ArrayList
	 */
	void displayOrder(int ArrayList);

	/**
	 * 
	 * @param String
	 */
	void cancelOrder(int String);

}