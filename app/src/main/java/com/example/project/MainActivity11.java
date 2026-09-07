package com.example.project;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity11 extends AppCompatActivity {

    private ImageButton btnBack;

    private TextView btnCallContact1;
    private TextView btnCallContact2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main11);

        // Back button
        btnBack = findViewById(R.id.btnBack);

        btnBack.setOnClickListener(v -> finish());


        // Contact 1
        btnCallContact1 = findViewById(R.id.btnCallContact1);

        btnCallContact1.setOnClickListener(v -> {
            makeCall("Contact 1");
        });


        // Contact 2
        btnCallContact2 = findViewById(R.id.btnCallContact2);

        btnCallContact2.setOnClickListener(v -> {
            makeCall("Contact 2");
        });
    }


    private void makeCall(String contactName) {

        Toast.makeText(
                this,
                "Calling " + contactName,
                Toast.LENGTH_SHORT
        ).show();

        // Later you can replace this with
        // the actual saved contact number.
    }
}