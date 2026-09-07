package com.example.project;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity6 extends AppCompatActivity {

    Button btnBack;
    Button btnSafetyTips;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main6);

        btnBack = findViewById(R.id.back);
        btnSafetyTips = findViewById(R.id.safetyTips);

        // BACK → HOME
        btnBack.setOnClickListener(v -> finish());

        // FLOOD INFORMATION → SAFETY TIPS
        btnSafetyTips.setOnClickListener(v -> {

            Intent intent = new Intent(
                    MainActivity6.this, MainActivity7.class
            );

            startActivity(intent);
        });
    }
}