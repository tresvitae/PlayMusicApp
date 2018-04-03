package com.example.android.playmusicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class DeepHouseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> musicLibrary = new ArrayList<Song>();
        musicLibrary.add(new Song("Matt Simons", "Catch & Release (Deepend Remix)", R.drawable.matt));
        musicLibrary.add(new Song("AHMET KILIC", "DEEP HOUSE SUMMER MIX 2", R.drawable.kilic));

        SongAdapter adapter = new SongAdapter(this, musicLibrary);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }

    public void viewMessage(View view) {
        Toast.makeText(view.getContext(), "Playing the song", Toast.LENGTH_SHORT).show();
    }
}