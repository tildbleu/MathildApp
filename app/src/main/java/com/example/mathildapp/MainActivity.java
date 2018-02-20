package com.example.mathildapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
