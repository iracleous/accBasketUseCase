package gr.codehub.model;

import java.util.Date;
import java.util.List;

public class Basket {

    private int id;
    private List<Product> products;
    private String customer;
    private Date dateTimePurchase;
    private Date dateTimeDelivery;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Date getDateTimePurchase() {
        return dateTimePurchase;
    }

    public void setDateTimePurchase(Date dateTimePurchase) {
        this.dateTimePurchase = dateTimePurchase;
    }

    public Date getDateTimeDelivery() {
        return dateTimeDelivery;
    }

    public void setDateTimeDelivery(Date dateTimeDelivery) {
        this.dateTimeDelivery = dateTimeDelivery;
    }
}
