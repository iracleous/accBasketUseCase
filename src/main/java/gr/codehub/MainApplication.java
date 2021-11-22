package gr.codehub;

import gr.codehub.businessexceptions.BasketException;
import gr.codehub.businessexceptions.ProductException;
import gr.codehub.model.Basket;
import gr.codehub.repository.BasketRepository;
import gr.codehub.repository.ProductRepository;
import gr.codehub.services.BasketService;
import gr.codehub.services.ProductService;
import gr.codehub.services.impl.BasketServiceImpl;
import gr.codehub.services.impl.ProductServiceImp;

import java.math.BigDecimal;

public class MainApplication {
    public static void main(String[] args)   {


        //staff member adds products

        ProductRepository productRepository = new ProductRepository();
        ProductService productService = new ProductServiceImp(productRepository);

        productService.createProduct(1,new BigDecimal("1.2"),"chips", "Tasty", 10);
        productService.createProduct(2,new BigDecimal("1.3"),"raffles", "Tasty", 10);

        System.out.println(productService.readProduct());


        //Customer buys
        BasketRepository basketRepository = new BasketRepository();
        BasketService basketService = new BasketServiceImpl(basketRepository, productRepository);

        Basket basket = basketService.createBasket("costas") ;

        int basketId = basket.getId();

        try {
            basketService.addProduct(basketId, 1);
            basketService.addProduct(basketId, 1);
            basketService.addProduct(basketId, 3);
        } catch (BasketException | ProductException e) {
            e.printStackTrace();
        }

        System.out.println("Total basket cost =" +basketService.getTotal(basketId));

    }
}
