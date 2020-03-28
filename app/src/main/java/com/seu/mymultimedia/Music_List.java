package com.seu.mymultimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Music_List extends AppCompatActivity {

    String song_link1="https://firebasestorage.googleapis.com/v0/b/basic-retrive-data.appspot.com/o/Charlie%20Puth%20-%20We%20Don%20t%20Talk%20Anymore%20feat.%20Selena%20Gomez.mp3?alt=media&token=7f7126f1-836c-4ca0-a82b-015476f0c01d";
    String song_link2="https://firebasestorage.googleapis.com/v0/b/basic-retrive-data.appspot.com/o/Imagine%20Dragons%20-%20Believer.mp3?alt=media&token=2d079c00-557d-44a2-950d-0ab11f44ddf4";
    String song_link3="https://firebasestorage.googleapis.com/v0/b/basic-retrive-data.appspot.com/o/Imagine%20Dragons%20%E2%80%93%20Thunder%20%F0%9F%8E%B5.mp3?alt=media&token=f146ee56-ab78-4451-9dc0-05d6fc33204f";
    String song_link4="https://firebasestorage.googleapis.com/v0/b/basic-retrive-data.appspot.com/o/In%20the%20end%20-%20Linkin%20Park%20(with).mp3?alt=media&token=fb70c6fa-f271-4139-91c3-88729a78d581";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music__list);
    }

    public void song1(View view) {
        Intent intent=new Intent(Music_List.this,Music_Player.class);
        intent.putExtra("song_Link",song_link1);
        startActivity(intent);


    }

    public void song2(View view) {

        Intent intent=new Intent(Music_List.this,Music_Player.class);
        intent.putExtra("song_Link",song_link2);
        startActivity(intent);
    }

    public void song3(View view) {
        Intent intent=new Intent(Music_List.this,Music_Player.class);
        intent.putExtra("song_Link",song_link3);
        startActivity(intent);

    }

    public void song4(View view) {
        Intent intent=new Intent(Music_List.this,Music_Player.class);
        intent.putExtra("song_Link",song_link4);
        startActivity(intent);

    }
}
