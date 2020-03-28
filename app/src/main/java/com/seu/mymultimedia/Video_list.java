package com.seu.mymultimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Video_list extends AppCompatActivity {

    String song_link1="https://firebasestorage.googleapis.com/v0/b/date-me-3eb50.appspot.com/o/vdo_demo%2Fvideoplayback%20(1).mp4?alt=media&token=7c876ece-fea2-4438-b4a5-761f4f7836ad";
    String song_link3="https://firebasestorage.googleapis.com/v0/b/date-me-3eb50.appspot.com/o/vdo_demo%2Fvideoplayback.mp4?alt=media&token=0f015e8d-8663-4d21-a648-d031e7bd26de";
    String song_link2="https://firebasestorage.googleapis.com/v0/b/date-me-3eb50.appspot.com/o/vdo_demo%2F%E0%A6%9F%E0%A6%BE%E0%A6%95%E0%A6%B2%E0%A6%BE%20-%20TAKLA%20-%20OST%20of%20Stadium%20-%20Bangla%20New%20Song%202020%20-%20Club%2011%20Entertainment.webm?alt=media&token=9de3b1d7-4a9d-44b3-b6d4-f796ed5dd678";
  //  String song_link4="https://firebasestorage.googleapis.com/v0/b/basic-retrive-data.appspot.com/o/In%20the%20end%20-%20Linkin%20Park%20(with).mp3?alt=media&token=fb70c6fa-f271-4139-91c3-88729a78d581";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_list);





    }

    public void play1(View view) {
        Intent intent=new Intent(getApplicationContext(),player_landscape.class);
        intent.putExtra("vdo_link",song_link1);
        startActivity(intent);



    }

    public void play3(View view) {
        Intent intent=new Intent(getApplicationContext(),player_landscape.class);
        intent.putExtra("vdo_link",song_link2);
        startActivity(intent);
    }

    public void play2(View view) {

        Intent intent=new Intent(getApplicationContext(),player_landscape.class);
        intent.putExtra("vdo_link",song_link3);
        startActivity(intent);
    }
}
