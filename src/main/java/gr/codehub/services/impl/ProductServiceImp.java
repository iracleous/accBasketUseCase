package gr.codehub.services.impl;

import gr.codehub.model.Product;
import gr.codehub.repository.ProductRepository;
import gr.codehub.services.ProductService;

import java.math.BigDecimal;

public class ProductServiceImp implements ProductService {
    private final ProductRepository productRepository;

    public ProductServiceImp(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product createProduct(int id, BigDecimal price, String name,
                                 String supplier, int quantity) {
        Product product = new Product(id,   price,   name,
                  supplier,   quantity);
        productRepository.addProduct(product);
        return product;
    }

    @Override
    public Product readProduct(int productId) {
        return productRepository.getProductById(productId);
    }

    @Override
    public Product updateProduct(int productId, BigDecimal newPrice) {
        Product product = productRepository.getProductById(productId);
        product.setPrice(newPrice);
        return product;
    }

    @Override
    public Product deleteProduct(int productId) {
        Product product = productRepository.getProductById(productId);
        productRepository.removeProduct(product);
        return product;
    }
}
