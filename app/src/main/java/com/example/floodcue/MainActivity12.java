package com.example.floodcue;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity12 extends AppCompatActivity {

    private ImageButton btnBack;

    private TextView btn112;
    private TextView btn108;
    private TextView btn100;
    private TextView btn101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main12);

        // Back button
        btnBack = findViewById(R.id.btnBack);

        btnBack.setOnClickListener(v -> finish());


        // Emergency numbers
        btn112 = findViewById(R.id.btn112);
        btn108 = findViewById(R.id.btn108);
        btn100 = findViewById(R.id.btn100);
        btn101 = findViewById(R.id.btn101);


        // 112 - Emergency
        btn112.setOnClickListener(v -> makeCall("112"));


        // 108 - Ambulance
        btn108.setOnClickListener(v -> makeCall("108"));


        // 100 - Police
        btn100.setOnClickListener(v -> makeCall("100"));


        // 101 - Fire
        btn101.setOnClickListener(v -> makeCall("101"));
    }


    private void makeCall(String number) {

        try {

            Intent intent = new Intent(
                    Intent.ACTION_DIAL,
                    Uri.parse("tel:" + number)
            );

            startActivity(intent);

        } catch (Exception e) {

            Toast.makeText(
                    this,
                    "Unable to open phone",
                    Toast.LENGTH_SHORT
            ).show();
        }
    }
}