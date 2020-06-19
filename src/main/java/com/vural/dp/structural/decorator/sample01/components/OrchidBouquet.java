package com.vural.dp.structural.decorator.sample01.components;

public class OrchidBouquet extends FlowerBouquet {

    public OrchidBouquet() {
        description = "Orchid bouquet";
    }

    @Override
    public double cost() {
        return 29.0;
    }
}
