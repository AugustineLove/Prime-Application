package com.example.prime;

import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;
public class WelcomeActivity extends AppCompatActivity {
    private static final long DELAY_TIME_MS = 3000;
    private VideoView videoView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        videoView = findViewById(R.id.videoView);

        // Set the video file path or URI
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.prime;
        Uri uri = Uri.parse(videoPath);

        // Configure the MediaController to enable video playback controls
//        MediaController mediaController = new MediaController(this);
//        videoView.setMediaController(mediaController);
//        mediaController.setAnchorView(videoView);

        // Set the URI of the video to be played
        videoView.setVideoURI(uri);

        // Start playing the video
        videoView.start();

        // Create a Handler object
        Handler handler = new Handler();

        // Use the postDelayed() method to delay the execution of the code
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start the new activity
                startActivity(new Intent(WelcomeActivity.this, SigninActivity.class));
                finish(); // Optional: Finish the current activity to prevent going back
            }
        }, DELAY_TIME_MS); // Convert delay to milliseconds
    }
}
