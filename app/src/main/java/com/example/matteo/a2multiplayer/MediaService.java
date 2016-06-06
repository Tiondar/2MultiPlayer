package com.example.matteo.a2multiplayer;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Matteo on 06/06/2016.
 */
public class MediaService extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("MediaService","onStartCommand");
        return super.onStartCommand(intent, flags, startId);
    }
}
