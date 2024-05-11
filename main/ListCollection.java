package main;

import java.util.ArrayList;

public class ListCollection implements Collection {

    private ArrayList <Playlist> playlistCollection;
    private String collectionName;

    public ListCollection(String collectionName){
        this.collectionName = collectionName;
    }

    public String allPlaylists(){
        MiscellaneousFuntions.arraylistEmpty(playlistCollection);

        String returnString = "";
        for (Playlist myPlaylist : playlistCollection){
            returnString += myPlaylist.playlistContents() + ", ";
        }
        return returnString;
    }
    
    public String particularPlaylist(Playlist myPlaylist){
        MiscellaneousFuntions.arraylistEmpty(playlistCollection);
        return myPlaylist.playlistContents();
    }

    public void removePlaylist(Playlist myPlaylist){
        playlistCollection.remove(myPlaylist);
    }

    public void addPlaylist(){
        playlistCollection.add(new ListPlaylist("Unnamed"));
    }

    public void createRandomPlaylist(String playlistName, double playlistDuration){
        //Where to continue from
    }
}
