package com.vural.dp.creational.factory.sample01.factory;

import com.vural.dp.creational.factory.sample01.shape.Circle;
import com.vural.dp.creational.factory.sample01.shape.Rectangle;
import com.vural.dp.creational.factory.sample01.shape.Shape;
import com.vural.dp.creational.factory.sample01.shape.Square;

public class ShapeFactory {

    public static Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("square")) {
            return new Square();
        }
        return null;
    }
}
