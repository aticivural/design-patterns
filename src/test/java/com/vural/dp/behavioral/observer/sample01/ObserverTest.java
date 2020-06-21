package com.vural.dp.behavioral.observer.sample01;

import org.junit.Test;

import java.math.BigDecimal;

public class ObserverTest {

    @Test
    public void testObserver() {
        Subject product = new Product("36 inch LED TV", new BigDecimal(350));
        Bidder bidder1 = new Bidder("Alex Parker");
        Bidder bidder2 = new Bidder("Henry Smith");
        Bidder bidder3 = new Bidder("Marry Peterson");

        product.registerObserver(bidder1);
        product.registerObserver(bidder2);
        product.registerObserver(bidder3);

        product.setBidAmount(bidder1, new BigDecimal(375));
        product.removeObserver(bidder2);
        product.setBidAmount(bidder3, new BigDecimal(400));

    }


}