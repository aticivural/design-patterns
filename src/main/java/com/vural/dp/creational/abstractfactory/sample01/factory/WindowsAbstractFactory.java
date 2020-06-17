package com.vural.dp.creational.abstractfactory.sample01.factory;

import com.vural.dp.creational.abstractfactory.sample01.buttons.Button;
import com.vural.dp.creational.abstractfactory.sample01.buttons.WindowsButton;
import com.vural.dp.creational.abstractfactory.sample01.checkbox.Checkbox;
import com.vural.dp.creational.abstractfactory.sample01.checkbox.WindowsCheckbox;

public class WindowsAbstractFactory implements GUIAbstractFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
