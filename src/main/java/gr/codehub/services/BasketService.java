package gr.codehub.services;

import gr.codehub.businessexceptions.BasketException;
import gr.codehub.businessexceptions.ProductException;
import gr.codehub.model.Basket;

import java.math.BigDecimal;
import java.util.Date;

public interface BasketService {
    Basket createBasket(String customer);
    Basket readBasket(int basketId);
    Basket updateBasket(Date deliveryDate);
    Basket deleteBasket(int basketId);

    void addProduct(int basketId, int productId) throws BasketException, ProductException;
    void removeProduct(int basketId, int productId);

    void persistBasket(String filename, int basketId);
    Basket loadBasket(String filename);

    BigDecimal getTotal(int basketId);

}
