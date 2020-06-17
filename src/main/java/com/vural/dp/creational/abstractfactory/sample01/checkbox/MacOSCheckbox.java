package com.vural.dp.creational.abstractfactory.sample01.checkbox;

public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You've created MacOSCheckbox");
    }
}
