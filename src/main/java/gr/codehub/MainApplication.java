package gr.codehub;

import gr.codehub.model.Product;
import gr.codehub.repository.ProductRepository;
import gr.codehub.services.ProductService;
import gr.codehub.services.impl.ProductServiceImp;

import java.math.BigDecimal;

public class MainApplication {
    public static void main(String[] args) {


        //staff member adds products

        ProductRepository productRepository = new ProductRepository();
        ProductService productService = new ProductServiceImp(productRepository);

        productService.createProduct(1,new BigDecimal("1.2"),"chips", "Tasty", 10);
        productService.createProduct(2,new BigDecimal("1.3"),"raffles", "Tasty", 10);

        System.out.println(productService.readProduct());


    }
}
