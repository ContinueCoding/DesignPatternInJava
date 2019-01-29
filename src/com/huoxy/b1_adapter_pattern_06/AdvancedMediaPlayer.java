package com.huoxy.b1_adapter_pattern_06;

//高级的媒体播放器接口 - 可播放vlc、MP4
public interface AdvancedMediaPlayer {

    void playVlc(String fileName);

    void playMp4(String fileName);
}