package com.example.android.playmusicapp;

public class Song {

    private String artistName;
    private String songName;
    private int albumImage;

    public Song(String useArtistName, String useSongName, int useAlbumImage) {
        artistName = useArtistName;
        songName = useSongName;
        albumImage = useAlbumImage;
    }

    public int getAlbumImage() {
        return albumImage;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getSongName() {
        return songName;
    }
}
