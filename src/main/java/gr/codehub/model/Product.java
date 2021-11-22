package gr.codehub.model;

import java.math.BigDecimal;


public class Product {
    private int id;
    private BigDecimal price;
    private String name;
    private String supplier;
    private int quantity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public Product() {
    }

    public Product(int id, BigDecimal price, String name, String supplier, int quantity) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.supplier = supplier;
        this.quantity = quantity;
    }
}
