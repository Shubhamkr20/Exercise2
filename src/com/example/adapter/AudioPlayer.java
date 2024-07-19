package com.example.adapter;

public class AudioPlayer {
    private MediaPlayer mediaPlayer;

    public AudioPlayer() {
        mediaPlayer = new MediaAdapter();
    }

    public void play(String fileName) {
        mediaPlayer.play(fileName);
    }

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("song.mp4");
    }
}
