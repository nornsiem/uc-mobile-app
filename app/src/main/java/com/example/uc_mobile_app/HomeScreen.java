package com.example.uc_mobile_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home_screen);

        ActionBar actionBar = getSupportActionBar();

        // If the ActionBar is not null, show it
        if (actionBar != null) {
            actionBar.show();  // Make the ActionBar visible
        }

        CardView news = findViewById(R.id.news_card);
        CardView personal = findViewById(R.id.payment_card);
        CardView contact = findViewById(R.id.news_card);
        CardView media = findViewById(R.id.media_card);
        CardView calander = findViewById(R.id.news_card);
        CardView ranking = findViewById(R.id.ranking);

        ranking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeScreen.this, RankingActivity.class);
                startActivity(intent);
            }
        });
        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeScreen.this, NewsActivity.class);
                startActivity(intent);
            }
        });
        personal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeScreen.this, PersonalActivity.class);
                startActivity(intent);
            }
        });
        media.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeScreen.this, MediaActivity.class);
                startActivity(intent);
            }
        });



    }
}