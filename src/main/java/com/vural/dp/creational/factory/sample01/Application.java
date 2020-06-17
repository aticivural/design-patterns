package com.vural.dp.creational.factory.sample01;

import com.vural.dp.creational.factory.sample01.factory.ShapeFactory;

public class Application {
    public static void main(String[] args) {
        ShapeFactory.getShape("circle").draw();
        ShapeFactory.getShape("rectangle").draw();
        ShapeFactory.getShape("square").draw();
    }
}
