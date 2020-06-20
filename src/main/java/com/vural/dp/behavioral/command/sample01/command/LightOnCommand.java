package com.vural.dp.behavioral.command.sample01.command;

import com.vural.dp.behavioral.command.sample01.domain.Light;

public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
