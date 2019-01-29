package com.huoxy.c2_command_pattern_15.example2;

public class Controller {

    private Command openCommand;
    private Command closeCommand;
    private Command changeChannelCommand;

    private int prevChannel, currentChannel = 1;

    public Controller(Command openCommand, Command closeCommand, Command changeChannelCommand) {
        this.openCommand = openCommand;
        this.closeCommand = closeCommand;
        this.changeChannelCommand = changeChannelCommand;
    }

    public void openTelevison() {
        openCommand.execute(0);
    }

    public void closeTelevison() {
        closeCommand.execute(0);
    }

    public void changeChannelTelevision() {
        prevChannel = currentChannel;
        currentChannel ++;
        changeChannelCommand.execute(currentChannel);
    }

    /**
     * 支持Undo、Redo操作！
     */
    public void ChannelUndo() {
        changeChannelCommand.execute(prevChannel);

        //交换prev、current
        int tempChannel;
        tempChannel = prevChannel;
        prevChannel = currentChannel;
        currentChannel = tempChannel;
    }
}
