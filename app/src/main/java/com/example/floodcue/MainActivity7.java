package com.example.floodcue;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity7 extends AppCompatActivity {

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

        setContentView(R.layout.activity_main7);

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
        ImageButton btnMenu = findViewById(R.id.btnMenu);

        btnMenu.setOnClickListener(v -> {
             PopupMenu popupMenu = new PopupMenu(
                    MainActivity7.this,
                    btnMenu
            );

            popupMenu.getMenuInflater().inflate(
                    R.menu.main_menu,
                    popupMenu.getMenu()
            );

            popupMenu.setOnMenuItemClickListener(item -> {

                int id = item.getItemId();

                if (id == R.id.menu_home) {
                    return true;
                }

                else if (id == R.id.menu_offline_maps) {
                    startActivity(new Intent(
                            MainActivity7.this,
                            MainActivity10.class
                    ));
                    return true;
                }

                else if (id == R.id.menu_safe_places) {
                    startActivity(new Intent(
                            MainActivity7.this,
                            MainActivity11.class
                    ));
                    return true;
                }

                else if (id == R.id.menu_emergency) {
                    startActivity(new Intent(
                            MainActivity7.this,
                            MainActivity12.class
                    ));
                    return true;
                }

                else if (id == R.id.menu_contacts) {
                    startActivity(new Intent(
                            MainActivity7.this,
                            MainActivity13.class
                    ));
                    return true;
                }

                return false;
            });

            popupMenu.show();
        });


        String userName =
                getIntent().getStringExtra("userName");

        if (userName != null && !userName.trim().isEmpty()) {

            txtHello.setText("Hello, " + userName + " 👋");

        } else {

            // Default name
            txtHello.setText("Hello, Keerthana 👋");
        }


        // -----------------------------------
        // FLOOD INFORMATION
        // -----------------------------------

        floodInformationCard.setOnClickListener(v -> {

            Intent intent =
                    new Intent(
                            MainActivity7.this,
                           MainActivity8.class
                    );

            startActivity(intent);

        });


        // -----------------------------------
        // SAFETY TIPS
        // -----------------------------------

        safetyTipsCard.setOnClickListener(v -> {

            Intent intent =
                    new Intent(
                            MainActivity7.this,
                            MainActivity9.class
                    );

            startActivity(intent);

        });


        // -----------------------------------
        // OFFLINE MAPS
        // -----------------------------------

        offlineMapsCard.setOnClickListener(v -> {

            Intent intent =
                    new Intent(
                            MainActivity7.this,
                            MainActivity10.class
                    );

            startActivity(intent);

        });


        // -----------------------------------
        // SAFE PLACES
        // -----------------------------------

        safePlacesCard.setOnClickListener(v -> {

            Intent intent =
                    new Intent(
                            MainActivity7.this,
                            MainActivity11.class
                    );

            startActivity(intent);

        });


        // -----------------------------------
        // EMERGENCY
        // -----------------------------------

        emergencyCard.setOnClickListener(v -> {

            Intent intent =
                    new Intent(
                            MainActivity7.this,
                            MainActivity12.class
                    );

            startActivity(intent);

        });


        // -----------------------------------
        // CONTACTS
        // -----------------------------------

        contactsCard.setOnClickListener(v -> {

            Intent intent =
                    new Intent(
                            MainActivity7.this,
                            MainActivity13.class
                    );

            startActivity(intent);

        });


        // -----------------------------------
        // FLOOD ALERT
        // -----------------------------------

        floodAlertCard.setOnClickListener(v -> {

            Intent intent =
                    new Intent(
                            MainActivity7.this,
                        MainActivity8.class
                    );

            startActivity(intent);

        });

    }
}