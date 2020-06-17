package com.vural.dp.creational.abstractfactory.sample01.factory;

import com.vural.dp.creational.abstractfactory.sample01.buttons.Button;
import com.vural.dp.creational.abstractfactory.sample01.buttons.MacOSButton;
import com.vural.dp.creational.abstractfactory.sample01.checkbox.Checkbox;
import com.vural.dp.creational.abstractfactory.sample01.checkbox.MacOSCheckbox;

public class MacOSAbstractFactory implements GUIAbstractFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
