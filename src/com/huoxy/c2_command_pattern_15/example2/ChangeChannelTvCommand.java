package com.huoxy.c2_command_pattern_15.example2;

public class ChangeChannelTvCommand implements Command {

    private Television television;

    public ChangeChannelTvCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute(int channelIndex) {
        television.changeChannel(channelIndex);
    }
}
