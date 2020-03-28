package com.seu.mymultimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class player_landscape extends AppCompatActivity {
    VideoView vdo_v;
    String vdo_lnk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_landscape);

        vdo_v=findViewById(R.id.vdo_land_view);

        vdo_lnk= getIntent().getStringExtra("vdo_link");

        MediaController mediaController=new MediaController(this);

        // vdo_v.setVideoURI(Uri.parse("android.resource://"+getOpPackageName()+"/" +  R.raw.takla));
        // vdo_v.setVideoURI(Uri.parse(""));
        vdo_v.setVideoPath(vdo_lnk);
        vdo_v.requestFocus();
        mediaController.setAnchorView(vdo_v);
        vdo_v.setMediaController(mediaController);
        vdo_v.start();

    }
}
