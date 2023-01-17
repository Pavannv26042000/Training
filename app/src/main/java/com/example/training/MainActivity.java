package com.example.training;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.training.projects.Example1;
import com.example.training.projects.Example2;
import com.example.training.projects.Example4;
import com.example.training.projects.LoginPage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.button1);
        Button btn1 = findViewById(R.id.button2);
        Button btn2 =  findViewById(R.id.button3);
        Button btn3 = findViewById(R.id.button4);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Example1.class);
                view.getContext().startActivity(intent);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(view.getContext(), Example2.class);
                view.getContext().startActivity(intent2);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent3 = new Intent(view.getContext(), LoginPage.class);
                view.getContext().startActivity(intent3);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(view.getContext(), Example4.class);
                view.getContext().startActivity(intent4);
            }
        });

    }
}