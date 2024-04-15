package main;

import java.util.ArrayList;

public class ListPlaylist implements Playlist {

    private ArrayList<Song> playlistStorage;
    private String playlistName;

    public ListPlaylist(String playlistName){
        this.playlistName = playlistName;
    }

    public String playlistContents(){
        if (playlistStorage.isEmpty()){
            throw new IllegalArgumentException("Playlist is empty!");
        }
        String returnString = "";
        for(Song song : playlistStorage){
            returnString += song.getName() + ", ";
        }
        return returnString;
    }

    public String playlistDuration(){
        if (playlistStorage.isEmpty()){
            throw new IllegalArgumentException("Playlist is empty!");
        }
        int minutes = 0;
        int seconds = 0;
        for (Song song : playlistStorage){
            int justMinutes = (int) song.getDuration();
            minutes += justMinutes;
            seconds += (int) (song.getDuration()-justMinutes)*100;
        }
        while (seconds > 60){
            seconds -= 60;
            minutes += 1;
        }

        return "Playlist Duration: " + minutes + " minutes & " + seconds + " seconds.";
    }

    public String play_next(){
        if (playlistStorage.isEmpty()){
            throw new IllegalArgumentException("Playlist is empty!");
        }
        Song thisSong = playlistStorage.get(0);
        playlistStorage.remove(0);
        return thisSong.toString();
    }

    public boolean isEmpty(){
        if (playlistStorage.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }

    public void addSong(Song mySong){
        playlistStorage.add(mySong);
    }

    public void removeSong(Song mySong){
        playlistStorage.remove(mySong);
    }
}
