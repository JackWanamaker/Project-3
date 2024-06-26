package main;

import java.util.ArrayList;

public class Song {
    private String artistName;
    private String songName;
    private String albumName;
    private int releaseYear;
    private double songDuration;

    public Song(String artistName, String songName, String albumName, int releaseYear, double songDuration){
        this.artistName = artistName;
        this.songName = songName;
        this.albumName = albumName;
        this.releaseYear = releaseYear;
        this.songDuration = songDuration;
    }

    public String getArtist(){
        return artistName;
    }

    public String getName(){
        return songName;
    }

    public String getAlbum(){
        return albumName;
    }

    public int getYear(){
        return releaseYear;
    }

    public double getDuration(){
        return songDuration;
    }

    public String toString(){
        return songName + " by " + artistName + ".";
    }
}
