package com.vural.dp.structural.decorator.sample01.decorators;

import com.vural.dp.structural.decorator.sample01.components.FlowerBouquet;

public class PaperWrapper extends FlowerBouquetDecorator {
    FlowerBouquet flowerBouquet;

    public PaperWrapper(FlowerBouquet flowerBouquet) {
        this.flowerBouquet = flowerBouquet;
    }

    @Override
    public String getDescription() {
        return flowerBouquet.getDescription() + ", paper wrap";
    }

    @Override
    public double cost() {
        return 3 + flowerBouquet.cost();
    }
}
