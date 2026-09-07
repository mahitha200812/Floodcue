package com.example.floodcue;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    EditText etUsername, etPassword;
    Button btnLogin;
    TextView tvForgotPassword, tvSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);

        btnLogin = findViewById(R.id.btnLogin);

        tvForgotPassword = findViewById(R.id.tvForgotPassword);
        tvSignUp = findViewById(R.id.tvSignUp);

        // Login
        btnLogin.setOnClickListener(v -> {

            String username = etUsername.getText().toString().trim();
            String password = etPassword.getText().toString().trim();

            if (username.isEmpty()) {
                etUsername.setError("Username is required");
                etUsername.requestFocus();
                return;
            }

            if (password.isEmpty()) {
                etPassword.setError("Password is required");
                etPassword.requestFocus();
                return;
            }

            // Backend login will be connected later
            Toast.makeText(
                    MainActivity2.this,
                    "Login request ready",
                    Toast.LENGTH_SHORT
            ).show();
        });

        // Sign Up
        tvSignUp.setOnClickListener(v -> {
            Intent intent = new Intent(
                    MainActivity2.this,
                    MainActivity3.class
            );
            startActivity(intent);
        });

        // Forgot Password
        tvForgotPassword.setOnClickListener(v -> {
            Intent intent = new Intent(
                    MainActivity2.this,
                   MainActivity4.class
            );
            startActivity(intent);
        });
    }
}