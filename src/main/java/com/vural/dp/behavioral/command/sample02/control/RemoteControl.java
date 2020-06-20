package com.vural.dp.behavioral.command.sample02.control;

import com.vural.dp.behavioral.command.sample02.command.CommandBase;

public class RemoteControl {

    private CommandBase onCommand;
    private CommandBase offCommand;
    private CommandBase undoCommand;

    public void onButtonPressed(CommandBase onCommand) {
        this.onCommand = onCommand;
        onCommand.execute();
        undoCommand = onCommand;
    }

    public void offButtonPressed(CommandBase offCommand) {
        this.offCommand = offCommand;
        offCommand.execute();
        undoCommand = offCommand;
    }

    public void undoButtonPressed() {
        undoCommand.undo();
    }

}
