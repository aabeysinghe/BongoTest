package com.fiix.anuat.bongotest;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    IMediaPlayer player;
    EditText editText;
    public static final String FROMAPP = "fromapp";
    public static final String FROMURL = "fromurl";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.txtURL);
        //editText.setText("https://www.soundhelix.com/examples/mp3/SoundHelix-Song-1.mp3");
    }

    public void play(View v) {
        MediaFactory mediaFactory = new MediaFactory(getApplicationContext());
        if (!editText.getText().toString().isEmpty()) {
            RemotePlay.urlString = editText.getText().toString();
            player = mediaFactory.getPlayer(FROMURL);
        } else {
            player = mediaFactory.getPlayer(FROMAPP);
        }
        player.Play(v);
    }

    public void pause(View v) {
        if (player != null) {
            player.Pause(v);
        }
    }

    public void Rewind(View v) {

        player.Rewind(v);
    }


}
