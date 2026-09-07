package com.example.floodcue;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity6 extends AppCompatActivity {

    EditText etNewPassword;
    EditText etConfirmPassword;
    Button btnResetPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        etNewPassword = findViewById(R.id.etNewPassword);
        etConfirmPassword = findViewById(R.id.etConfirmPassword);
        btnResetPassword = findViewById(R.id.btnResetPassword);

        btnResetPassword.setOnClickListener(v -> {

            String newPassword =
                    etNewPassword.getText().toString();

            String confirmPassword =
                    etConfirmPassword.getText().toString();

            if (newPassword.isEmpty()) {
                etNewPassword.setError("Password is required");
                etNewPassword.requestFocus();
                return;
            }

            if (confirmPassword.isEmpty()) {
                etConfirmPassword.setError(
                        "Confirm your password"
                );
                etConfirmPassword.requestFocus();
                return;
            }

            if (!newPassword.equals(confirmPassword)) {
                etConfirmPassword.setError(
                        "Passwords do not match"
                );
                etConfirmPassword.requestFocus();
                return;
            }

            Toast.makeText(
                    this,
                    "Password reset successfully",
                    Toast.LENGTH_SHORT
            ).show();

            Intent intent = new Intent(
                   MainActivity6.this,
                    MainActivity2.class
            );

            intent.addFlags(
                    Intent.FLAG_ACTIVITY_CLEAR_TOP |
                            Intent.FLAG_ACTIVITY_NEW_TASK
            );

            startActivity(intent);
            finish();
        });
    }
}