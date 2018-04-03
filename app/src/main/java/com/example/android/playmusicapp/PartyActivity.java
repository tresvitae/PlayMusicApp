package com.example.android.playmusicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class PartyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> musicLibrary = new ArrayList<Song>();
        musicLibrary.add(new Song("Brydo", "FLOWERS IN THE POURIN' RAIN", R.drawable.brydo));
        musicLibrary.add(new Song("Don Diablo", "Cutting Shapes", R.drawable.don_diablo));
        musicLibrary.add(new Song("Birdy", "Keeping Your Head Up (Don Diablo Remix)", R.drawable.birdy));
        musicLibrary.add(new Song("Adult Swim", "Dj SpinKing Ft. Tyga, Asap Ferg, Jeremih, & Velous (Produced By Vinylz x SpinKing)", R.drawable.adult_swim));

        SongAdapter adapter = new SongAdapter(this, musicLibrary);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }

    public void viewMessage(View view) {
        Toast.makeText(view.getContext(), "Playing the song", Toast.LENGTH_SHORT).show();
    }
}
