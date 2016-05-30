package org.college.android.itomer.recyclerintro;


public class Song {
    String name;
    String artist;
    String duration;
    String lyrics;
    int albumResID;

    public Song(String name, String artist, String duration, String lyrics, int albumResID) {
        this.name = name;
        this.artist = artist;
        this.duration = duration;
        this.lyrics = lyrics;
        this.albumResID = albumResID;
    }
}
