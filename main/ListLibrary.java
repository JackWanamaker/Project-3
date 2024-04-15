package main;

public class ListLibrary implements Library {
    /*
     * Return a string representing all songs in the library in
     * alphabetical order (artist first, then song title)
     */
    void alphabeticaList();

    /*
     * Retreive information about a song within the library
     */
    void songInfo(String songName);

    /*
     * Add a collection of songs to the library
     */
    void importCollection(SongCollection mySongs);

    /*
     * Remove a collection of songs from the library.
     * Also removes all instances of these songs from playlists.
     */
    void discontinueCollection(SongCollection mySongs);
}
