package gr.codehub.repository;

import gr.codehub.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    private List<Product> products = new ArrayList<>();


    public void addProduct(Product product){
        products.add(product);
     }

     public boolean removeProduct(Product product ){
         products.remove(product);
         return true;
     }


     public Product getProductById(int productId){
        for (Product product: products)
            if (product.getId()==productId)
                return product;
        return null;
     }

}
