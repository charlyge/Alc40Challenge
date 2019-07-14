package com.charlyge.android.alc40challenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void viewMyProfile(View view) {
        Intent intent = new Intent(MainActivity.this,MyProfile.class);
        startActivity(intent);
    }

    public void AboutAlc(View view) {
        Intent intent = new Intent(MainActivity.this,AboutAlc.class);
        startActivity(intent);

    }
}
