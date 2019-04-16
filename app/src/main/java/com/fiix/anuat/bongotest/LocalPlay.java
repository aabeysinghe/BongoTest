package com.fiix.anuat.bongotest;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Handler;
import android.view.View;
import android.widget.SeekBar;

public class LocalPlay extends AbstractMediaPlayer {

    public LocalPlay(Context context) {
        this.context = context;
        mediaPlayer = MediaPlayer.create(context, R.raw.song1);
    }

    @Override
    public void Play(View v) {

        if (timeElapsed > 0) {
            mediaPlayer.seekTo((int) timeElapsed);
            totalTime = (int) mediaPlayer.getDuration();
            mediaPlayer.start();
        } else {
            mediaPlayer.start();
            totalTime = (int) mediaPlayer.getDuration();
        }


    }

}
