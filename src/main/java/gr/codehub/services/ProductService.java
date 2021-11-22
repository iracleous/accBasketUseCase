package gr.codehub.services;

import gr.codehub.model.Product;

import java.math.BigDecimal;
import java.util.Date;

public interface ProductService {
    Product createProduct(int id, BigDecimal price, String name, String supplier, int quantity);
    Product readProduct(int productId);
    Product updateProduct(int productId, BigDecimal newPrice);
    Product deleteProduct(int productId);
}
