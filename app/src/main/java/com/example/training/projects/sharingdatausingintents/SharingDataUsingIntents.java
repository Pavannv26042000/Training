package com.example.training.projects.sharingdatausingintents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.training.R;

public class SharingDataUsingIntents extends AppCompatActivity {
    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.sharing_data_using_intents);
        TextView textView = findViewById(R.id.sharingDataTextView);
        Button button = findViewById(R.id.shareButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( textView.getText().equals(null)){
                    Toast.makeText(SharingDataUsingIntents.this, "EnterDetails", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(view.getContext(),SecondActivity.class);
                    String str = textView.getText().toString();
                    intent.putExtra("message_key", str);
                    startActivity(intent);
                }
            }
        });
    }
}
