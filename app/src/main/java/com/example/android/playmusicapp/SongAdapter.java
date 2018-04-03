package com.example.android.playmusicapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    private static final String LOG_TAG = SongAdapter.class.getSimpleName();

    public SongAdapter(Activity context, ArrayList<Song> musicLibrary) {
        super(context, 0, musicLibrary);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Song currentDeepHouseAdapter = getItem(position);
        TextView artistName = (TextView) listItemView.findViewById(R.id.artist_name);
        artistName.setText(currentDeepHouseAdapter.getArtistName());

        TextView songName = (TextView) listItemView.findViewById(R.id.song_name);
        songName.setText(currentDeepHouseAdapter.getSongName());

        ImageView albumImage = (ImageView) listItemView.findViewById(R.id.image_album);
        albumImage.setImageResource(currentDeepHouseAdapter.getAlbumImage());

        return listItemView;
    }
}