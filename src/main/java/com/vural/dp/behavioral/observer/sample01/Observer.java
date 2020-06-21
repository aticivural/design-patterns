package com.vural.dp.behavioral.observer.sample01;

import java.math.BigDecimal;

public interface Observer {

    void update(Observer observer, String productName, BigDecimal bidAmount);
}
