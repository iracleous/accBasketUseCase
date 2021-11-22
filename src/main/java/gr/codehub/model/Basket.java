package gr.codehub.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Basket {

    private int id;
    private List<BasketItem> products = new ArrayList<>();
    private String customer;
    private Date dateTimePurchase;
    private Date dateTimeDelivery;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<BasketItem> getProducts() {
        return products;
    }

   public Product addProduct(Product product){

        for(BasketItem basketItem:products){
            if (basketItem.getProduct().getId()==product.getId()){
                basketItem.setQuantity(basketItem.getQuantity() + 1);
                return basketItem.getProduct();
            }
         }

        BasketItem basketItem = new BasketItem(product, 1);
        products.add(basketItem);
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
        for(BasketItem basketItem:products)
        {
            total = total.add( basketItem
                    .getProduct()
                    .getPrice()
                    .multiply(new BigDecimal(basketItem.getQuantity()))  ) ;
        }
        return total;
    }
}
