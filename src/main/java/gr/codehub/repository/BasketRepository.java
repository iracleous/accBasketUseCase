package gr.codehub.repository;

import gr.codehub.model.Basket;
import gr.codehub.model.Basket;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BasketRepository {
    private final List<Basket> baskets = new ArrayList<>();

    
    public Basket createBasket(String customer ){

        Basket basket = new Basket();
        basket.setId(baskets.size()+1);
        basket.setCustomer(customer);
        basket.setDateTimePurchase(new Date());
        basket.setDateTimeDelivery( new Date() );
        baskets.add(basket);
        return basket;
    }

    public boolean removeBasket(Basket basket ){
        baskets.remove(basket);
        return true;
    }


    public Basket getBasketById(int basketId){
        for (Basket basket: baskets)
            if (basket.getId()==basketId)
                return basket;
        return null;
    }

    public List<Basket> getBaskets(){
        return baskets;
    }




}
