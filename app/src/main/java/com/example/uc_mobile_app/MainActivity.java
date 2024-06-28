package com.example.uc_mobile_app;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_language);

        Button next_language= findViewById(R.id.next_language);
        Button home = findViewById(R.id.navi_home);
//        TextView next =  findViewById(R.id.title);
        next_language.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the new screen on click
                navigateToDashboard();
            }
        });

        if(home != null){
            home.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Navigate to the new screen on click
                    navigateToHomeScreen();
                }
            });
        }



    }
    private void navigateToDashboard() {
        // Define the target activity class
        Class<?> targetActivity = Dashboard.class;

        // Create an Intent to launch the target activity
        Intent intent = new Intent(this, targetActivity);

        // Optionally, send data to the second activity (if needed)
        // intent.putExtra("key", value);

        // Start the activity
        startActivity(intent);
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