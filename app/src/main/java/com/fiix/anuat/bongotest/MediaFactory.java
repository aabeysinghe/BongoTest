package com.fiix.anuat.bongotest;

import android.content.Context;
import android.widget.SeekBar;

 class MediaFactory {

    Context context;

     MediaFactory(Context context) {
        this.context = context;

    }

     IMediaPlayer getPlayer(String playerType) {
        if (playerType == null) {
            return null;
        }
        if (playerType.equalsIgnoreCase(MainActivity.FROMAPP)) {
            return new LocalPlay(context);

        } else if (playerType.equalsIgnoreCase(MainActivity.FROMURL)) {
            return new RemotePlay(context);
        }

        return null;
    }
}
