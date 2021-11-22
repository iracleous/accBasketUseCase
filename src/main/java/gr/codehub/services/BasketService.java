package gr.codehub.services;

import gr.codehub.model.Basket;
import gr.codehub.model.Product;

import java.util.Date;

public interface BasketService {
    Basket createBasket(String customer);
    Basket readBasket(int basketId);
    Basket updateBasket(Date deliveryDate);
    Basket deleteBasket(int basketId);

    void addProduct(int basketId, Product product);
    void removeProduct(int basketId, Product product);

    void persistBasket(String filename, int basketId);
    Basket loadBasket(String filename);

}
