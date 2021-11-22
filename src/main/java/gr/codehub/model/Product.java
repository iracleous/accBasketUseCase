package gr.codehub.model;

import java.math.BigDecimal;


public class Product {
    private int id;
    private BigDecimal price;
    private String name;
    private String supplier;
    private int inventoryQuantity;

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

    public int getInventoryQuantity() {
        return inventoryQuantity;
    }

    public void setInventoryQuantity(int inventoryQuantity) {
        this.inventoryQuantity = inventoryQuantity;
    }

    public Product() {
    }

    public Product(int id, BigDecimal price, String name, String supplier, int inventoryQuantity) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.supplier = supplier;
        this.inventoryQuantity = inventoryQuantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", supplier='" + supplier + '\'' +
                ", quantity=" + inventoryQuantity +
                '}';
    }
}
