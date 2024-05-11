package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Song> mySongs = MiscellaneousFuntions.createSongs();
        ListPlaylist myPlaylist = new ListPlaylist("Test Playlist");

        myPlaylist.addSong(mySongs.get(0));
        myPlaylist.addSong(mySongs.get(1));
        myPlaylist.addSong(mySongs.get(2));
        myPlaylist.addSong(mySongs.get(3));
        myPlaylist.addSong(mySongs.get(4));
        myPlaylist.addSong(mySongs.get(5));

        double myDouble = myPlaylist.playlistDuration();
        System.out.println(myDouble);
    }
}
