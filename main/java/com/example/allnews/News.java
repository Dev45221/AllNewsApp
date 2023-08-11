package com.example.allnews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class News extends AppCompatActivity {

    CardView hindustanTimes, timesOfIndia, googleNews, swatantraSamay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        hindustanTimes = findViewById(R.id.hindustan_times);
        timesOfIndia = findViewById(R.id.times_of_india);
        googleNews = findViewById(R.id.google_news);
        swatantraSamay = findViewById(R.id.swatantra_samay);

        hindustanTimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(News.this, Webview.class);
                intent.putExtra("links", "https://www.hindustantimes.com/");
                startActivity(intent);
            }
        });

        timesOfIndia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(News.this, Webview.class);
                intent.putExtra("links", "https://timesofindia.indiatimes.com/?from=mdr");
                startActivity(intent);
            }
        });

        googleNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(News.this, Webview.class);
                intent.putExtra("links", "https://news.google.com/home?hl=en-IN&gl=IN&ceid=IN:en");
                startActivity(intent);
            }
        });

        swatantraSamay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(News.this, Webview.class);
                intent.putExtra("links", "https://swatantrasamay.com/");
                startActivity(intent);
            }
        });

    }
}