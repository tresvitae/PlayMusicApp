package com.example.android.playmusicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class JazzActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> musicLibrary = new ArrayList<Song>();

        musicLibrary.add(new Song("Bredzisław", "Pink Panther Flute Impro", R.drawable.pink));
        musicLibrary.add(new Song("YoungOnes", "Ichisan - Terminal E (Piano Version)", R.drawable.young_ones));
        musicLibrary.add(new Song("Jerzy Maczynski", "Bemsha Swing", R.drawable.bemsha));
        musicLibrary.add(new Song("katze murr", "das kind und die zeit - mix", R.drawable.katze));
        musicLibrary.add(new Song("Asger Thomsen", "Guitar", R.drawable.asger));
        musicLibrary.add(new Song("Gospel Harmonica", "Joshua fit the battle of Jericho", R.drawable.gospel));

        SongAdapter adapter = new SongAdapter(this, musicLibrary);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }

    public void viewMessage(View view) {
        Toast.makeText(view.getContext(), "Playing the song", Toast.LENGTH_SHORT).show();
    }
}

