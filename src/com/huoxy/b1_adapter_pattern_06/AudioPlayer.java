package com.huoxy.b1_adapter_pattern_06;

//
public class AudioPlayer implements MediaPlayer {
    private MediaAdapter vlcPlayer;
    private MediaAdapter mp4Player;

    @Override
    public void play(String audioType, String fileName) {
        if ("mp3".equalsIgnoreCase(audioType)) {
            System.out.println("Playing Mp3... fileName = "+ fileName);
        } else if ("vlc".equalsIgnoreCase(audioType)) {
            if (vlcPlayer == null) {
                vlcPlayer = new MediaAdapter(audioType);
            }
            vlcPlayer.play(audioType, fileName);
        } else if ("mp4".equalsIgnoreCase(audioType)) {
            if (mp4Player == null) {
                mp4Player = new MediaAdapter(audioType);
            }
            mp4Player.play(audioType, fileName);
        } else {
            System.out.println("Invalid audioType: " + audioType);
            //throw new IllegalArgumentException("Invalid audioType: " + audioType);
        }
    }
}
