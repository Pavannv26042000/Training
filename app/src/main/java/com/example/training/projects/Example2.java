package com.example.training.projects;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.training.R;

public class Example2 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.example2);
        Intent intent =  getPackageManager().getLaunchIntentForPackage("com.google.android.youtube");
        startActivity(intent);
    }
}
