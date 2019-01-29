package com.huoxy.c2_command_pattern_15.example2;

public class CloseTvCommand implements Command {

    private Television television;

    public CloseTvCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute(int channelIndex) {
        television.close();
    }
}
