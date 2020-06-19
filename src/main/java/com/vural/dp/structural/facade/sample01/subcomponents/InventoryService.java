package com.vural.dp.structural.facade.sample01.subcomponents;

import com.vural.dp.structural.facade.sample01.domain.Product;

public class InventoryService {
    public static boolean isAvailable(Product product) {
        /*Check warehouse database for product availability*/
        return true;
    }
}
