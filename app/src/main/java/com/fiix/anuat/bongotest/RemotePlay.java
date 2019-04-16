package com.fiix.anuat.bongotest;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.View;
import android.widget.SeekBar;

import java.io.IOException;

public class RemotePlay extends AbstractMediaPlayer {

     static String urlString = "";

     RemotePlay(Context context) {
        this.context = context;
    }

    @Override
    public void Play(View v) {

        Uri myUri = Uri.parse(urlString);
        mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        try {
            mediaPlayer.setDataSource(context, myUri);
            mediaPlayer.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }

        mediaPlayer.start();
        totalTime = (int) mediaPlayer.getDuration();

    }

}
