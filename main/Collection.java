package main;

public interface Collection {
    
    /*
     * Return a string representing all playlist names and their durations
     */
    void allPlaylists();

    /*
     * Return a string representing the contents of a particular playlist
     */
    void particularPlaylist(Playlist myPlaylist);

    /*
     * Removes a playlist
     */
    void removePlaylist(Playlist myPlaylist);

    /*
     * Adds a new empty playlist
     */
    void addPlaylist();

    /*
     * Create a new random playlist of a specified duration
     */
    void createRandomPlaylist(String playlistName);

    /*
     * Remove a song from all playlists
     */
    void removeSong();
}
