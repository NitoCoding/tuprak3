package com.example.tuprak3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the status RecyclerView
        RecyclerView statusView = findViewById(R.id.statusListView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        statusView.setLayoutManager(layoutManager);

        // Create and set the StatusAdapter
        StatusAdapter statusAdapter = new StatusAdapter(this,DataSource.DataList);
        statusView.setAdapter(statusAdapter);

        // Initialize the card RecyclerView
        RecyclerView cardView = findViewById(R.id.cardListView);

        // Create and set the CardAdapter with the context and list
        CardAdapter cardAdapter = new CardAdapter(this, DataSource.DataList); // Add 'this' as context
        cardView.setAdapter(cardAdapter);
    }
}