package com.example.android.playmusicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // "Button" for display new Deep House Activity
        final TextView deepHouse = (TextView) findViewById(R.id.deep_house);
        deepHouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent deepHouseIntent = new Intent(MainActivity.this, DeepHouseActivity.class);
                startActivity(deepHouseIntent);
            }
        });

        // "Button" for display new Jazz Activity
        final TextView jazz = (TextView) findViewById(R.id.jazz);
        jazz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jazzIntent = new Intent(MainActivity.this, JazzActivity.class);
                startActivity(jazzIntent);
            }
        });

        final TextView party = (TextView) findViewById(R.id.party);
        party.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent partyIntent = new Intent(MainActivity.this, PartyActivity.class);
                startActivity(partyIntent);
            }
        });

        final TextView sleep = (TextView) findViewById(R.id.sleep);
        sleep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sleepIntent = new Intent(MainActivity.this, SleepActivity.class);
                startActivity(sleepIntent);
            }
        });
    }
}
