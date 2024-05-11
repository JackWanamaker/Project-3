package main;

public interface Playlist {
    
    /*
     * Returns a string representing all songs in the playlist
     */
    String playlistContents();

    /*
     * Calculates and returns the duration of the playlist
     */
    double playlistDuration();
    
    /*
     * Play next song, returning song info and removing it
     * from the playlist.
     */
    String play_next();

    /*
     * Return true if empty, false otherwise.
     */
    boolean isEmpty();

    /*
     * Adds a Song
     */
    void addSong(Song mySong);

    /*
     * Removes a Song
     */
    void removeSong(Song mySong);

    
}