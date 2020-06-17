package com.vural.dp.creational.abstractfactory.sample01.buttons;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You've created WindowsButton");
    }
}
