package com.wordpress.mnsalim.foodgrabber.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wordpress.mnsalim.foodgrabber.R;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        initView();
    }

    /**
     * Initiate View object and primary functions.
     */
    private void initView()
    {
        Timer timer = new Timer();

        timer.schedule(new TimerTask()
        {
            @Override
            public void run()
            {
                Intent myIntent = new Intent(SplashActivity.this,HomeActivity.class);
                SplashActivity.this.startActivity(myIntent);
                finish();
            }
        }, 2000);

    }

}
