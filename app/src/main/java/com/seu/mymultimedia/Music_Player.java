package com.seu.mymultimedia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.chibde.visualizer.SquareBarVisualizer;

import java.io.IOException;

public class Music_Player extends AppCompatActivity {

    MediaPlayer mp;
    Button start, pause, stop;

    String musicLink;
    SquareBarVisualizer squareBarVisualizer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music__player);

        mp = new MediaPlayer();


        musicLink= getIntent().getStringExtra("song_Link");

        squareBarVisualizer= findViewById(R.id.visualizer);

        squareBarVisualizer.setColor(ContextCompat.getColor(this, R.color.colorAccent));
        squareBarVisualizer.setDensity(15);
        squareBarVisualizer.setGap(20);

        squareBarVisualizer.setPlayer(mp.getAudioSessionId());


        start = (Button) findViewById(R.id.button1);
        pause = (Button) findViewById(R.id.button2);
        stop = (Button) findViewById(R.id.button3);


        try {
            mp.setDataSource(musicLink);
            mp.prepare();

        } catch (IOException e) {
            e.printStackTrace();
        }



    }

    public void start(View view) {
        mp.start();
    }

    public void pause(View view) {
        mp.pause();
    }

    public void stop(View view) {
        mp.stop();


        try {
            mp.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        if (mp!=null){

            mp.stop();
        }

        finish();
    }
}
