package com.vural.dp.structural.decorator.sample01.components;

public class RoseBouquet extends FlowerBouquet {

    public RoseBouquet() {
        description = "Rose bouquet";
    }

    @Override
    public double cost() {
        return 12.0;
    }
}
