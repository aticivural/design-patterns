package com.vural.dp.structural.flyweight.sample01;

import org.junit.Test;

public class FlyweightTest {

    @Test
    public void drawTest() {
        Pen yellowThickPen1 = PenFactory.getThickPen("YELLOW"); // created new pen
        yellowThickPen1.draw("hello world");

        Pen yellowThickPen2 = PenFactory.getThickPen("YELLOW"); // pen is shared
        yellowThickPen2.draw("hello world");

        Pen blueThinPen = PenFactory.getThickPen("BLUE"); // created new pen
        blueThinPen.draw("hello world");

        System.out.println(yellowThickPen1.hashCode());
        System.out.println(yellowThickPen2.hashCode());
        System.out.println(blueThinPen.hashCode());
    }
}