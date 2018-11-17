package payment;

import java.util.ArrayList;

public interface BillDAO {

	/**
	 * 
	 * @param Bill
	 */
	void addBill(int Bill);

	/**
	 * 
	 * @param Bill
	 */
	void updateBill(int Bill);

	/**
	 * 
	 * @param Bill
	 */
	void removeBill(int Bill);

	ArrayList getAllBill();

	/**
	 * 
	 * @param Bill
	 */
	void displayBill(int Bill);

}