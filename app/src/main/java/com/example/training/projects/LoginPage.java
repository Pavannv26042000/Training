package com.example.training.projects;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.training.R;

import java.net.PasswordAuthentication;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginpage);
        ImageView imageView = (ImageView) findViewById(R.id.imageView2);
        TextView textView = findViewById(R.id.textView);
        EditText username = findViewById(R.id.editTextTextPersonName);
        EditText passwd = findViewById(R.id.editTextTextPassword);
        Button btn3 = findViewById(R.id.button);
        CheckBox checkBox = findViewById(R.id.checkBox);
        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (username.getText()!= null && passwd.getText()!= null && checkBox.isChecked())  {

                        Toast.makeText(getBaseContext(), "Submitted ", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(getBaseContext(), "Details are missing", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
