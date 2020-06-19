package com.vural.dp.structural.facade.sample01.servicefacade;

import com.vural.dp.structural.facade.sample01.domain.Product;
import com.vural.dp.structural.facade.sample01.subcomponents.InventoryService;
import com.vural.dp.structural.facade.sample01.subcomponents.PaymentService;
import com.vural.dp.structural.facade.sample01.subcomponents.ShippingService;

public class OrderServiceFacadeImpl implements OrderServiceFacade {
    @Override
    public boolean placeOrder(int productId) {
        boolean orderFullfilled = false;
        Product product = new Product();
        product.productId = productId;

        if (InventoryService.isAvailable(product)) {
            System.out.println("Product with ID: " + product.productId + " is available");
            boolean paymentConfirmed = PaymentService.makePayment();
            if (paymentConfirmed) {
                System.out.println("Payment confirmed");
                ShippingService.shipProduct(product);
                System.out.println("Product shipped");
                orderFullfilled = true;
            }
        }
        return orderFullfilled;
    }
}
