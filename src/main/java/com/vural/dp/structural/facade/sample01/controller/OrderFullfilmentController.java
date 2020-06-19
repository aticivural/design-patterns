package com.vural.dp.structural.facade.sample01.controller;

import com.vural.dp.structural.facade.sample01.servicefacade.OrderServiceFacade;

public class OrderFullfilmentController {

    private OrderServiceFacade facade;

    public OrderFullfilmentController(OrderServiceFacade facade) {
        this.facade = facade;
    }

    boolean orderFullfilled = false;

    public void orderProduct(int productId) {
        orderFullfilled = facade.placeOrder(productId);
        System.out.println("OrderFullfillmentController: Order fullfillment completed.");
    }

}
