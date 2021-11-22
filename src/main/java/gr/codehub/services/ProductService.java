package gr.codehub.services;

import gr.codehub.model.Product;

import java.math.BigDecimal;
import java.util.List;

public interface ProductService {
    Product createProduct(int id, BigDecimal price, String name, String supplier, int quantity);
    Product readProduct(int productId);
    List<Product> readProduct();
    Product updateProduct(int productId, BigDecimal newPrice);
    Product deleteProduct(int productId);
}
