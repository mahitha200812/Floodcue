package com.example.project;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);

        Button login = findViewById(R.id.btnLogin);
        TextView signup = findViewById(R.id.tvSignup);

        login.setOnClickListener(v -> {

            Intent intent =
                    new Intent(MainActivity2.this,
                            MainActivity5.class);

            startActivity(intent);
            finish();
        });

        signup.setOnClickListener(v -> {

            Intent intent =
                    new Intent(MainActivity2.this,
                            MainActivity4.class);

            startActivity(intent);
        });
    }
}