package com.example.floodcue;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    EditText etUsername;
    Button btnContinue;
    TextView tvBackToLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        etUsername = findViewById(R.id.etUsername);
        btnContinue = findViewById(R.id.btnContinue);
        tvBackToLogin = findViewById(R.id.tvBackToLogin);

        btnContinue.setOnClickListener(v -> {

            String username =
                    etUsername.getText().toString().trim();

            if (username.isEmpty()) {
                etUsername.setError("Username is required");
                etUsername.requestFocus();
                return;
            }

            Intent intent = new Intent(
                    MainActivity4.this,
                    MainActivity5.class
            );

            intent.putExtra("username", username);

            startActivity(intent);
        });

        tvBackToLogin.setOnClickListener(v -> finish());
    }
}