package com.example.uc_mobile_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dashboard);
        Button home = findViewById(R.id.navi_home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the new screen on click
                navigateToHomeScreen();
            }
        });
    }
    private void navigateToHomeScreen() {
        // Define the target activity class
        Class<?> targetActivity = HomeScreen.class;

        // Create an Intent to launch the target activity
        Intent intent = new Intent(this, targetActivity);

        // Optionally, send data to the second activity (if needed)
        // intent.putExtra("key", value);

        // Start the activity
        startActivity(intent);
    }
}