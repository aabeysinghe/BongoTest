package com.fiix.anuat.bongotest;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Handler;
import android.view.View;
import android.widget.SeekBar;

public abstract class AbstractMediaPlayer implements IMediaPlayer {
    Context context;
    MediaPlayer mediaPlayer;
    double totalTime=0.0;
    int rewindTime =2000;
    static double timeElapsed = 0;

    public abstract void Play(View v);

    @Override
    public void Pause(View v) {
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.pause();
                timeElapsed = mediaPlayer.getCurrentPosition();
            } else {
                mediaPlayer.seekTo((int) timeElapsed);
                mediaPlayer.start();
            }
        }
    }

    @Override
    public void Rewind(View v) {
        if (mediaPlayer != null) {

            timeElapsed = mediaPlayer.getCurrentPosition();
            if (timeElapsed-rewindTime >  0) {
                timeElapsed = timeElapsed - rewindTime;
                mediaPlayer.seekTo((int) timeElapsed);
            }
        }
    }

}
