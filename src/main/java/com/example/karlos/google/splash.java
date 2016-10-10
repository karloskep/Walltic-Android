package com.example.karlos.google;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.romainpiel.shimmer.Shimmer;
import com.romainpiel.shimmer.ShimmerTextView;

import java.util.Timer;
import java.util.TimerTask;

public class splash extends AppCompatActivity {

    private Shimmer shimmer;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splash);

            ShimmerTextView myShimmerTextView = (ShimmerTextView)findViewById(R.id.nome);
            shimmer = new Shimmer();
            shimmer.start(myShimmerTextView);
            shimmer.setDuration(6200);
            shimmer.setStartDelay(400);

            new Timer().schedule(new TimerTask() {

                @Override
                public void run() {
                    finish();

                    Intent intent = new Intent();
                    intent.setClass(splash.this, MainActivity.class);
                    startActivity(intent);

                }
            }, 2500);
        }


    }

