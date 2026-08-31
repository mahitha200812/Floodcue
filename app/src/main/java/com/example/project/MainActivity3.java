package com.example.project;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity3 extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ImageButton menuButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main3);

        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.navigationView);
        menuButton = findViewById(R.id.menuButton);


        // Open menu
        menuButton.setOnClickListener(v -> {

            if (drawerLayout.isDrawerOpen(navigationView)) {
                drawerLayout.closeDrawer(navigationView);
            } else {
                drawerLayout.openDrawer(navigationView);
            }

        });


        // Menu item clicks
        navigationView.setNavigationItemSelectedListener(item -> {

            int id = item.getItemId();

            if (id == R.id.nav_home) {

                Toast.makeText(this,
                        "Home",
                        Toast.LENGTH_SHORT).show();

            } else if (id == R.id.nav_profile) {

                Toast.makeText(this,
                        "Profile",
                        Toast.LENGTH_SHORT).show();

            } else if (id == R.id.nav_flood) {

                Toast.makeText(this,
                        "Flood Information",
                        Toast.LENGTH_SHORT).show();

            } else if (id == R.id.nav_safety) {

                Toast.makeText(this,
                        "Safety Tips",
                        Toast.LENGTH_SHORT).show();

            } else if (id == R.id.nav_maps) {

                Toast.makeText(this,
                        "Offline Maps",
                        Toast.LENGTH_SHORT).show();

            } else if (id == R.id.nav_emergency) {

                Toast.makeText(this,
                        "Emergency",
                        Toast.LENGTH_SHORT).show();

            } else if (id == R.id.nav_contacts) {

                Toast.makeText(this,
                        "Emergency Contacts",
                        Toast.LENGTH_SHORT).show();

            } else if (id == R.id.nav_settings) {

                Toast.makeText(this,
                        "Settings",
                        Toast.LENGTH_SHORT).show();

            } else if (id == R.id.nav_logout) {

                Toast.makeText(this,
                        "Logout",
                        Toast.LENGTH_SHORT).show();

            }

            drawerLayout.closeDrawer(navigationView);

            return true;
        });
    }
}