package com.example.floodcue;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity5 extends AppCompatActivity {

    EditText etCode;
    Button btnVerify;
    TextView tvResend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        etCode = findViewById(R.id.etCode);
        btnVerify = findViewById(R.id.btnVerify);
        tvResend = findViewById(R.id.tvResend);

        btnVerify.setOnClickListener(v -> {

            String code = etCode.getText().toString().trim();

            if (code.isEmpty()) {
                etCode.setError("Enter verification code");
                etCode.requestFocus();
                return;
            }

            if (code.length() != 6) {
                etCode.setError("Enter 6-digit verification code");
                etCode.requestFocus();
                return;
            }

            Intent intent = new Intent(
                    MainActivity5.this,
                    MainActivity6.class
            );

            startActivity(intent);
        });

        tvResend.setOnClickListener(v -> {
            Toast.makeText(
                    this,
                    "Resend request ready for backend",
                    Toast.LENGTH_SHORT
            ).show();
        });
    }
}