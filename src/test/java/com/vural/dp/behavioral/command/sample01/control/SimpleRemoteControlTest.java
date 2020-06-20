package com.vural.dp.behavioral.command.sample01.control;

import com.vural.dp.behavioral.command.sample01.command.LightOnCommand;
import com.vural.dp.behavioral.command.sample01.command.StereoOffCommand;
import com.vural.dp.behavioral.command.sample01.command.StereoOnWithCDCommand;
import com.vural.dp.behavioral.command.sample01.domain.Light;
import com.vural.dp.behavioral.command.sample01.domain.Stereo;
import org.junit.Test;

public class SimpleRemoteControlTest {

    @Test
    public void testRemoteControl() {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light = new Light();
        Stereo stereo = new Stereo();

        remoteControl.setCommand(new LightOnCommand(light));
        remoteControl.buttonWasPressd();

        remoteControl.setCommand(new StereoOnWithCDCommand(stereo));
        remoteControl.buttonWasPressd();

        remoteControl.setCommand(new StereoOffCommand(stereo));
        remoteControl.buttonWasPressd();
    }
}