package com.vural.dp.creational.abstractfactory.sample01;

import com.vural.dp.creational.abstractfactory.sample01.buttons.Button;
import com.vural.dp.creational.abstractfactory.sample01.checkbox.Checkbox;
import com.vural.dp.creational.abstractfactory.sample01.factory.GUIAbstractFactory;

public class Application {

    Button button;
    Checkbox checkbox;

    public Application(GUIAbstractFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
