package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity5 extends AppCompatActivity {

    // Greeting
    private TextView txtHello;

    // Quick access cards
    private CardView floodInformationCard;
    private CardView safetyTipsCard;
    private CardView offlineMapsCard;
    private CardView safePlacesCard;
    private CardView emergencyCard;
    private CardView contactsCard;

    // Alert
    private CardView floodAlertCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main5);

        // -----------------------------------
        // FIND VIEWS
        // -----------------------------------

        txtHello = findViewById(R.id.txtHello);

        floodInformationCard =
                findViewById(R.id.floodInformationCard);

        safetyTipsCard =
                findViewById(R.id.safetyTipsCard);

        offlineMapsCard =
                findViewById(R.id.offlineMapsCard);

        safePlacesCard =
                findViewById(R.id.safePlacesCard);

        emergencyCard =
                findViewById(R.id.emergencyCard);

        contactsCard =
                findViewById(R.id.contactsCard);

        floodAlertCard =
                findViewById(R.id.floodAlertCard);


        // -----------------------------------
        // GET USER NAME
        // -----------------------------------

        String userName =
                getIntent().getStringExtra("userName");

        if (userName != null && !userName.trim().isEmpty()) {

            txtHello.setText("Hello, " + userName + " 👋");

        }


        // -----------------------------------
        // FLOOD INFORMATION
        // -----------------------------------

        floodInformationCard.setOnClickListener(v -> {

            Intent intent =
                    new Intent(
                            MainActivity5.this,
                          MainActivity6.class
                    );

            startActivity(intent);

        });


        // -----------------------------------
        // SAFETY TIPS
        // -----------------------------------

        safetyTipsCard.setOnClickListener(v -> {

            Intent intent =
                    new Intent(
                            MainActivity5.this,
                            MainActivity7.class
                    );

            startActivity(intent);

        });


        // -----------------------------------
        // OFFLINE MAPS
        // -----------------------------------

        offlineMapsCard.setOnClickListener(v -> {

            Intent intent =
                    new Intent(
                            MainActivity5.this,
                           MainActivity8.class
                    );

            startActivity(intent);

        });


        // -----------------------------------
        // SAFE PLACES
        // -----------------------------------

        safePlacesCard.setOnClickListener(v -> {

            Intent intent =
                    new Intent(
                            MainActivity5.this,
                            MainActivity9.class
                    );

            startActivity(intent);

        });


        // -----------------------------------
        // EMERGENCY
        // -----------------------------------

        emergencyCard.setOnClickListener(v -> {

            Intent intent =
                    new Intent(
                            MainActivity5.this,
                            MainActivity10.class
                    );

            startActivity(intent);

        });


        // -----------------------------------
        // CONTACTS
        // -----------------------------------

        contactsCard.setOnClickListener(v -> {

            Intent intent =
                    new Intent(
                            MainActivity5.this,
                            MainActivity11.class
                    );

            startActivity(intent);

        });


        // -----------------------------------
        // FLOOD ALERT
        // -----------------------------------

        floodAlertCard.setOnClickListener(v -> {

            Intent intent =
                    new Intent(
                            MainActivity5.this,
                           MainActivity6.class
                    );

            startActivity(intent);

        });

    }
}