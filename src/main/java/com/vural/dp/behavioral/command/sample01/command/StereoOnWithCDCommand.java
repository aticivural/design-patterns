package com.vural.dp.behavioral.command.sample01.command;

import com.vural.dp.behavioral.command.sample01.domain.Stereo;

public class StereoOnWithCDCommand implements Command {
    private Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
