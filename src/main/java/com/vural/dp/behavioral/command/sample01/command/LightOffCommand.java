package com.vural.dp.behavioral.command.sample01.command;

import com.vural.dp.behavioral.command.sample01.domain.Light;

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
