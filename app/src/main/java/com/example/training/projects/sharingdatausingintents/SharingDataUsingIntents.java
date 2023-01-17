package com.example.training.projects.sharingdatausingintents;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.training.R;

public class SharingDataUsingIntents extends AppCompatActivity {
    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.sharing_data_using_intents);
        TextView textView = findViewById(R.id.sharingDataTextView);

    }
}
