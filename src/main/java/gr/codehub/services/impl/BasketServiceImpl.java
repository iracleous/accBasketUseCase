package gr.codehub.services.impl;

import gr.codehub.model.Basket;
import gr.codehub.model.Product;
import gr.codehub.repository.BasketRepository;
import gr.codehub.services.BasketService;

import java.util.Date;

public class BasketServiceImpl implements BasketService {

    private BasketRepository basketRepository;

    public BasketServiceImpl(BasketRepository basketRepository) {
        this.basketRepository = basketRepository;
    }

    @Override
    public Basket createBasket(String customer) {
        return basketRepository.createBasket(customer);
    }

    @Override
    public Basket readBasket(int basketId) {
        return null;
    }

    @Override
    public Basket updateBasket(Date deliveryDate) {
        return null;
    }

    @Override
    public Basket deleteBasket(int basketId) {
        return null;
    }

    @Override
    public void addProduct(int basketId, Product product) {

    }

    @Override
    public void removeProduct(int basketId, Product product) {

    }

    @Override
    public void persistBasket(String filename, int basketId) {

    }

    @Override
    public Basket loadBasket(String filename) {
        return null;
    }
}
