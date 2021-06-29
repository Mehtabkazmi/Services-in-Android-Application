package com.example.services;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyServices extends Service {
    MediaPlayer mediaPlayer;
    public IBinder onBind(Intent intent) {
        return null;
    }
    public void onCreate(){
        Toast.makeText(this, "Service Created", Toast.LENGTH_SHORT).show();
        mediaPlayer=MediaPlayer.create(this,R.raw.zindadili );
                mediaPlayer.setLooping(false);
    }
    public void onStart(Intent intent,int startid){
        Toast.makeText(this, "Service Started", Toast.LENGTH_SHORT).show();
        mediaPlayer.start();
    }
    public void onDestroy(){
        Toast.makeText(this, "Service Stoped", Toast.LENGTH_SHORT).show();
        mediaPlayer.stop();
    }

}
