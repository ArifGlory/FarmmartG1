package com.example.fujimiya.farmmart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    Intent i;
    int delay = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);

        Timer waktu = new Timer();
        TimerTask show = new TimerTask() {
            @Override
            public void run() {
                finish();
                i = new Intent(SplashActivity.this,LoginActivity.class);
                startActivity(i);
            }
        };

        waktu.schedule(show,delay);





    }
}
