package com.example.eslam.musicalstructureapp;

/**
 * Created by Eslam on 2/22/2018.
 */

public class SongDetails {
    String name;
    String artist;
    String duration;

    public SongDetails(String name, String artist, String duration) {
        this.name = name;
        this.artist = artist;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public String getDuration() {
        return duration;
    }
}
