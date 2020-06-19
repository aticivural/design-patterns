package com.vural.dp.structural.decorator.sample01.components;

public abstract class FlowerBouquet {
    String description;

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
