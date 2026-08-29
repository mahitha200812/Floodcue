package com.example.project;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity7 extends AppCompatActivity {

    private Button btnBefore;
    private Button btnDuring;
    private Button btnAfter;

    private TextView tvSectionTitle;

    private TextView tip1Title;
    private TextView tip1Description;

    private TextView tip2Title;
    private TextView tip2Description;

    private TextView tip3Title;
    private TextView tip3Description;

    private TextView tip4Title;
    private TextView tip4Description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main7);

        // Buttons
        btnBefore = findViewById(R.id.btnBefore);
        btnDuring = findViewById(R.id.btnDuring);
        btnAfter = findViewById(R.id.btnAfter);

        // Title
        tvSectionTitle = findViewById(R.id.tvSectionTitle);

        // Tip 1
        tip1Title = findViewById(R.id.tip1Title);
        tip1Description = findViewById(R.id.tip1Description);

        // Tip 2
        tip2Title = findViewById(R.id.tip2Title);
        tip2Description = findViewById(R.id.tip2Description);

        // Tip 3
        tip3Title = findViewById(R.id.tip3Title);
        tip3Description = findViewById(R.id.tip3Description);

        // Tip 4
        tip4Title = findViewById(R.id.tip4Title);
        tip4Description = findViewById(R.id.tip4Description);

        // Back button
        Button btnBack = findViewById(R.id.btnBack);

        btnBack.setOnClickListener(v -> finish());

        // Default screen
        showBefore();

        // BEFORE
        btnBefore.setOnClickListener(v -> {

            showBefore();

        });

        // DURING
        btnDuring.setOnClickListener(v -> {

            showDuring();

        });

        // AFTER
        btnAfter.setOnClickListener(v -> {

            showAfter();

        });
    }


    // ==========================================
    // BEFORE FLOOD
    // ==========================================

    private void showBefore() {

        tvSectionTitle.setText("Before a Flood");

        tip1Title.setText("Prepare an emergency kit");

        tip1Description.setText(
                "Keep water, food, medicines, torch and batteries ready."
        );

        tip2Title.setText("Know your evacuation plan");

        tip2Description.setText(
                "Identify safe routes and shelters in your area."
        );

        tip3Title.setText("Stay informed");

        tip3Description.setText(
                "Check weather updates and official alerts regularly."
        );

        tip4Title.setText("Ensure electrical safety");

        tip4Description.setText(
                "Keep electrical appliances and wiring protected from water."
        );

        selectButton(btnBefore);

    }


    // ==========================================
    // DURING FLOOD
    // ==========================================

    private void showDuring() {

        tvSectionTitle.setText("During a Flood");

        tip1Title.setText("Move to higher ground");

        tip1Description.setText(
                "Move to a safe elevated location when flooding begins."
        );

        tip2Title.setText("Follow official instructions");

        tip2Description.setText(
                "Listen to emergency authorities and follow evacuation orders."
        );

        tip3Title.setText("Avoid floodwater");

        tip3Description.setText(
                "Do not walk or travel through moving or unknown floodwater."
        );

        tip4Title.setText("Stay connected");

        tip4Description.setText(
                "Keep your phone charged and monitor emergency alerts."
        );

        selectButton(btnDuring);

    }


    // ==========================================
    // AFTER FLOOD
    // ==========================================

    private void showAfter() {

        tvSectionTitle.setText("After a Flood");

        tip1Title.setText("Return only when safe");

        tip1Description.setText(
                "Return home only after authorities say the area is safe."
        );

        tip2Title.setText("Avoid damaged areas");

        tip2Description.setText(
                "Stay away from damaged buildings, roads and electrical lines."
        );

        tip3Title.setText("Check drinking water");

        tip3Description.setText(
                "Use safe drinking water and follow local health guidance."
        );

        tip4Title.setText("Report hazards");

        tip4Description.setText(
                "Report dangerous conditions to the appropriate authorities."
        );

        selectButton(btnAfter);

    }


    // ==========================================
    // SELECTED BUTTON
    // ==========================================

    private void selectButton(Button selected) {

        // Reset all buttons

        btnBefore.setBackgroundTintList(
                getColorStateList(R.color.navy_card)
        );

        btnDuring.setBackgroundTintList(
                getColorStateList(R.color.navy_card)
        );

        btnAfter.setBackgroundTintList(
                getColorStateList(R.color.navy_card)
        );

        btnBefore.setTextColor(
                getColor(R.color.light_text)
        );

        btnDuring.setTextColor(
                getColor(R.color.light_text)
        );

        btnAfter.setTextColor(
                getColor(R.color.light_text)
        );

        // Highlight selected button

        selected.setBackgroundTintList(
                getColorStateList(R.color.blue)
        );

        selected.setTextColor(
                getColor(R.color.white)
        );
    }
}