package gr.codehub.services.impl;

import gr.codehub.businessexceptions.BasketException;
import gr.codehub.businessexceptions.ProductException;
import gr.codehub.model.Basket;
import gr.codehub.model.BasketItem;
import gr.codehub.model.Product;
import gr.codehub.repository.BasketRepository;
import gr.codehub.repository.ProductRepository;
import gr.codehub.services.BasketService;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Date;

public class BasketServiceImpl implements BasketService {

    private BasketRepository basketRepository;
    private ProductRepository productRepository;

    public BasketServiceImpl(BasketRepository basketRepository, ProductRepository productRepository) {
        this.basketRepository = basketRepository;
        this.productRepository = productRepository;
    }

    @Override
    public Basket createBasket(String customer) {
        return basketRepository.createBasket(customer);
    }

    @Override
    public Basket readBasket(int basketId) {

        return basketRepository.getBasketById(basketId);
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
    public void addProduct(int basketId, int productId) throws BasketException, ProductException {
        Basket basket = readBasket(basketId);
        if (basket == null) throw new BasketException("The basket does not exit");
        Product product = productRepository.getProductById(productId);
        if (product == null) throw new ProductException("The product does not exit");
        basket.addProduct(product);
    }


    @Override
    public void removeProduct(int basketId, int productId) {
// todo
    }

    @Override
    public void persistBasket(String filename, int basketId) {

        Basket basket = basketRepository.getBasketById(basketId);
        if (basket == null) return;

        try ( PrintWriter printWriter = new PrintWriter(filename)){

            printWriter.println("Id, Name, Price, Supplier, Quantity, sub Total");
              for(BasketItem bProduct: basket.getProducts()){
                printWriter.println(bProduct.getProduct().getId() +","+
                        bProduct.getProduct().getName() +","+
                        bProduct.getProduct().getPrice() +","+
                        bProduct.getProduct().getSupplier()+","+
                        bProduct.getQuantity()+","+
                        bProduct.getProduct()
                                .getPrice()
                                .multiply(new BigDecimal(bProduct.getQuantity())) );
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Basket loadBasket(String filename) {
        return null;
    }

    @Override
    public BigDecimal getTotal(int basketId) {
        Basket basket = readBasket(basketId);

        return basket.getTotal();
    }


}
