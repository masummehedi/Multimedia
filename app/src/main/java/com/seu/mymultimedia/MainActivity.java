package com.seu.mymultimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.karumi.dexter.Dexter;
import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     requ_perm();

    }

    private void requ_perm() {
        Dexter.withActivity(this)
                .withPermissions(
                    Manifest.permission.INTERNET,
                        Manifest.permission.RECORD_AUDIO
                     )
                .withListener(new MultiplePermissionsListener() {
                    @Override
                    public void onPermissionsChecked(MultiplePermissionsReport report) {
                        // check if all permissions are granted
                        if (report.areAllPermissionsGranted()) {
                            // do you work now
                        }

                        // check for permanent denial of any permission
                        if (report.isAnyPermissionPermanentlyDenied()) {
                            // permission is denied permenantly, navigate user to app settings
                        }
                    }

                    @Override
                    public void onPermissionRationaleShouldBeShown(List<PermissionRequest> permissions, PermissionToken token) {
                        token.continuePermissionRequest();
                    }
                })
                .onSameThread()
                .check();

    }

    public void audio(View view) {
        Intent intent = new Intent(getApplicationContext(), Music_List.class);
        startActivity(intent);


    }

    public void video(View view) {
        Intent intent = new Intent(getApplicationContext(), Video_list.class);
        startActivity(intent);
    }

    public void image(View view) {
        Intent intent = new Intent(getApplicationContext(), Image_Viwer.class);
        startActivity(intent);
    }


}
