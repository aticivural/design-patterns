package com.vural.dp.behavioral.command.sample01.control;

import com.vural.dp.behavioral.command.sample01.command.Command;

public class SimpleRemoteControl {

    private Command slot;

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressd() {
        slot.execute();
    }

}
