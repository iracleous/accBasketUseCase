package gr.codehub.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Basket {

    private int id;
    private List<Product> products = new ArrayList<>();
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

   public Product addProduct(Product product){
        products.add(product);
        return product;
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


    public BigDecimal getTotal(){
        BigDecimal total =  BigDecimal.valueOf(0.);
        for(Product product:products)
        {
            total = total.add(product.getPrice()) ;
        }
        return total;
    }
}
