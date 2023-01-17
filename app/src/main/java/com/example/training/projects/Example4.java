package com.example.training.projects;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.training.R;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class Example4 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.example4);
        Button btn = findViewById(R.id.button5);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                builder.setTitle("Hii");
                builder.setMessage("Hello").setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(),"OK",Toast.LENGTH_LONG).show();
                        finish();
                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                        Toast.makeText(getApplicationContext(),"Cancelled",Toast.LENGTH_LONG).show();
                    }
                });
             AlertDialog alert = builder.create();
             alert.setMessage("Are you working well");
             alert.show();
            }
        });

    }
}