package com.vural.dp.creational.abstractfactory.sample01.factory;

import com.vural.dp.creational.abstractfactory.sample01.buttons.Button;
import com.vural.dp.creational.abstractfactory.sample01.checkbox.Checkbox;

public interface GUIAbstractFactory {

    Button createButton();

    Checkbox createCheckbox();
}
