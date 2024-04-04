package main;

public interface Playlist {
    
    /*
     * Returns a string representing all songs in the playlist
     */
    void playlistContents();

    /*
     * Calculates and returns the duration of the playlist
     */
    void playlistDuration();
    
    /*
     * Play next song, returning song info and removing it
     * from the playlist.
     */
    void play_next();

    /*
     * Return true if empty, false otherwise.
     */
    void isEmpty();

    /*
     * Adds a Song
     */
    void addSong(Song mySong);

    /*
     * Removes a Song
     */
    void removeSong(Song mySong);

    
}