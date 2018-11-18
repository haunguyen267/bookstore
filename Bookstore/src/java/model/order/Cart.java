package model.order;

import model.book.Book;
import java.util.ArrayList;
import java.util.Date;
import model.person.Customer;

public class Cart {

    private Customer customer;
    private ArrayList<Item> listItem;
    private Date timeMadeCart;
    private float total;

    public Cart() {
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

    public ArrayList<Item> getListItem() {
        return this.listItem;
    }

    /**
     *
     * @param listBook
     */
    public void setListBook(ArrayList listItem) {
        // TODO - implement Cart.setListBook
        this.listItem = listItem;
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

    public float getTotal() {
        float sum = 0;
        for (Item item : listItem) {
            sum += item.getPrice() * item.getQuantity();
        }
        return sum;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    /**
     *
     * @param total
     */
}
