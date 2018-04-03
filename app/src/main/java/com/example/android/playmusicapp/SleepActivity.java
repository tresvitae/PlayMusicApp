package com.example.android.playmusicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class SleepActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> musicLibrary = new ArrayList<Song>();
        musicLibrary.add(new Song("Galimatias", "Alina Baraz & Galimatias - Make You Feel", R.drawable.galimatias));
        musicLibrary.add(new Song("Alina Baraz", "Alina Baraz & Galimatias - Show Me", R.drawable.alina_baraz));
        musicLibrary.add(new Song("HW&W Recordings", "Stwo - Syrup", R.drawable.hww));
        musicLibrary.add(new Song("Moods", "Ashtraynutz - City Life (Moods Remix)", R.drawable.moods));

        SongAdapter adapter = new SongAdapter(this, musicLibrary);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }

    public void viewMessage(View view) {
        Toast.makeText(view.getContext(), "Playing the song", Toast.LENGTH_SHORT).show();
    }
}
