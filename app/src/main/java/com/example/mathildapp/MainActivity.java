package com.example.mathildapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(LOG_TAG, "-------");
        Log.d(LOG_TAG, "onCreate");
    }

    @Override
    public void onStart(){
        super.onStart();
        Log.d(LOG_TAG, "onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "onPause");
    }

    public void launchCount(View view) {
        Intent intent = new Intent(this, ActivityCount.class);
        startActivity(intent);

    }

    public void launchTalking(View view) {
        Intent intent = new Intent(this, TalkingActivity.class);
        startActivity(intent);

    }

    public void launchShowPictures(View view) {
        Intent intent = new Intent(this, PicturesActivity.class);
        startActivity(intent);

    }

    public void launchAchieve(View view) {
        Intent intent = new Intent(this, AchieveActivity.class);
        startActivity(intent);

    }
}
