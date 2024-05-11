package main;

import java.util.ArrayList;

public class ListPlaylist implements Playlist {

    private ArrayList<Song> playlistStorage = new ArrayList<>();
    private String playlistName;

    public ListPlaylist(String playlistName){
        this.playlistName = playlistName;
    }

    public String playlistContents(){
        MiscellaneousFuntions.arraylistEmpty(playlistStorage);

        String returnString = "";
        for(Song song : playlistStorage){
            returnString += song.toString() + ", ";
        }
        return returnString;
    }

    public double playlistDuration(){
        MiscellaneousFuntions.arraylistEmpty(playlistStorage);

        int minutes = 0;
        int seconds = 0;
        for (Song song : playlistStorage){
            int justMinutes = (int) song.getDuration();
            minutes += justMinutes;
            seconds += (int) Math.round((song.getDuration() - justMinutes)*100);
            while (seconds > 60){
                seconds -= 60;
                minutes += 1;
            }
        }
        return minutes + ( seconds *.01);
    }

    public String play_next(){
        MiscellaneousFuntions.arraylistEmpty(playlistStorage);
        
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
