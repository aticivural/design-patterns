package com.vural.dp.structural.flyweight.sample01;

public class MediumPen implements Pen {
    BrushSize brushSize = BrushSize.MEDIUM;
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw(String content) {
        System.out.println("Drawing MEDIUM content in color : " + color);
    }


}
