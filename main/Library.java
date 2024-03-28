package main;

public interface Library<T> {
    
    /*
     *  a String with all songs in the library,
     * ordered alphabetically by Artist, then song title.
     */
    String alphabetical_list();


    /*
     * Returns a string with the information about a song
     * in the library. 
     */
}