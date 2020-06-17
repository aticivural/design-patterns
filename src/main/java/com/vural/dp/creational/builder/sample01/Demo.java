package com.vural.dp.creational.builder.sample01;

public class Demo {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder("500 GB", "16 GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();

        System.out.println(computer);

    }
}
