package com.huoxy.b1_adapter_pattern_06;

//单独播放Vlc的播放器
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing Vlc... fileName = "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //do nothing
    }
}
