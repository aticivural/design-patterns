package com.vural.dp.creational.singleton.sample02;

import org.junit.Test;

public class SingletonTest {

    @Test
    public void enumSingletonTest() {
        Singleton instance = Singleton.INSTANCE;
        instance.doSomething();
    }


}