package com.example.project;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main4);

        Button create = findViewById(R.id.btnCreate);
        TextView login = findViewById(R.id.login);
        CheckBox terms = findViewById(R.id.terms);

        create.setOnClickListener(v -> {

            if (terms.isChecked()) {

                Intent intent =
                        new Intent(MainActivity4.this,
                                MainActivity2.class);

                startActivity(intent);
                finish();

            } else {

                terms.setError("Accept Terms & Conditions");
            }
        });

        login.setOnClickListener(v -> finish());
    }
}