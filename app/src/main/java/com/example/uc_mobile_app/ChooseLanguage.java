package com.example.uc_mobile_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ChooseLanguage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setTheme(R.style.ThemeWithoutActionBar);
        setContentView(R.layout.activity_choose_language);

        ActionBar actionBar = getSupportActionBar();

        // If the ActionBar is not null, show it
        if (actionBar != null) {
            actionBar.hide();  // Make the ActionBar visible
        }

        Button next_language= findViewById(R.id.next_language);
        next_language.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Class<?> targetActivity = Dashboard.class;
                Intent intent = new Intent(ChooseLanguage.this, Dashboard.class);
                startActivity(intent);
            }
        });
    }


}

class LanguageModel {

    private String name;
    private int imageResourceId; // Use resource ID for drawable images

    public LanguageModel(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    // Getter methods (optional, provide controlled access)
    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}