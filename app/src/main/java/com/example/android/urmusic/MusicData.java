package com.example.android.urmusic;

import java.util.ArrayList;

public class MusicData {

    /**
     * {@link MusicData} contents the details about the music files.
     * Each object has 3 properties: song title, artist name, and image resource ID.
     */
    // Name of the song
    private String songName;

    // Name of the artist
    private String artistName;

    // Drawable resource ID
    private int mImageResourceId;

    /*
     * Create a new MusicData object.
     *
     * @param sName is the name of the song
     * @param aName is the name of the artist
     * @param image is drawable reference ID of the song
     * */
    public MusicData(String sName, String aName, int imageResourceId) {
        songName = sName;
        artistName = aName;
        mImageResourceId = imageResourceId;
    }

    public MusicData(MainActivity mainActivity, ArrayList<MusicData> musics) {
    }

    /**
     * Get the name of the song
     */
    public String getSongName() {
        return songName;
    }

    /**
     * Get the name of the artist
     */
    public String getArtistName() {
        return artistName;
    }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
}
