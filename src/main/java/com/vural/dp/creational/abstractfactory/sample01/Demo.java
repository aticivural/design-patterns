package com.vural.dp.creational.abstractfactory.sample01;

import com.vural.dp.creational.abstractfactory.sample01.factory.GUIAbstractFactory;
import com.vural.dp.creational.abstractfactory.sample01.factory.MacOSAbstractFactory;
import com.vural.dp.creational.abstractfactory.sample01.factory.WindowsAbstractFactory;

public class Demo {

    public static void main(String[] args) {
        Application application = configureApplication();
        application.paint();
    }

    private static Application configureApplication() {
        GUIAbstractFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSAbstractFactory();
        } else {
            factory = new WindowsAbstractFactory();
        }
        return new Application(factory);
    }

}
