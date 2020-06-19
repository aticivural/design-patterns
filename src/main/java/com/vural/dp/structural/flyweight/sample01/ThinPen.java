package com.vural.dp.structural.flyweight.sample01;

public class ThinPen implements Pen {

    BrushSize brushSize = BrushSize.THIN;
    private String color;

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw(String content) {
        System.out.println("Drawing THIN content in color : " + color);
    }
}
