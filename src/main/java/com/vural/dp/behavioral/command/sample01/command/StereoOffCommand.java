package com.vural.dp.behavioral.command.sample01.command;

import com.vural.dp.behavioral.command.sample01.domain.Stereo;

public class StereoOffCommand implements Command {
    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
