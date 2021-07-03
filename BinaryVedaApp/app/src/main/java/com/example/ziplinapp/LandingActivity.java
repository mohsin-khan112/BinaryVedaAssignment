package com.example.ziplinapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LandingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void registerButton(View view) {
        Intent intent = new Intent(LandingActivity.this, ProfileActivity.class);
        startActivity(intent);
    }
}