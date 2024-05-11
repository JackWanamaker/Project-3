package tests;

import main.Song;
import main.MiscellaneousFuntions;
import main.ListPlaylist;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PlaylistTest {
    ArrayList<Song> mySongs = MiscellaneousFuntions.createSongs();
    ListPlaylist myPlaylist = new ListPlaylist("Test Playlist");
    
    @Test
    public void playlistTests(){
        assertTrue(myPlaylist.isEmpty());

        myPlaylist.addSong(mySongs.get(0));
        assertEquals(myPlaylist.playlistContents(), mySongs.get(0).toString() + ", ");
        assertEquals(myPlaylist.playlistDuration(), 3.32);
        assertFalse(myPlaylist.isEmpty());
        assertEquals(myPlaylist.play_next(), mySongs.get(0).toString());
        assertTrue(myPlaylist.isEmpty());

        myPlaylist.addSong(mySongs.get(0));
        myPlaylist.addSong(mySongs.get(1));

        assertEquals(myPlaylist.play_next(), mySongs.get(0).toString());
        assertFalse(myPlaylist.isEmpty());

        myPlaylist.addSong(mySongs.get(0));
        myPlaylist.addSong(mySongs.get(2));
        myPlaylist.addSong(mySongs.get(3));
        myPlaylist.addSong(mySongs.get(4));
        myPlaylist.addSong(mySongs.get(5));

        assertEquals(myPlaylist.playlistDuration(), 25.45);
        assertEquals(myPlaylist.playlistContents(), mySongs.get(1).toString() + ", " + mySongs.get(0).toString() + ", " + 
                                                    mySongs.get(2).toString() + ", " + mySongs.get(3).toString() + ", " + 
                                                    mySongs.get(4).toString() + ", " + mySongs.get(5).toString() + ", ");
        
        myPlaylist.removeSong(mySongs.get(0));
        myPlaylist.removeSong(mySongs.get(1));
        myPlaylist.removeSong(mySongs.get(2));
        myPlaylist.removeSong(mySongs.get(3));
        myPlaylist.removeSong(mySongs.get(4));
        myPlaylist.removeSong(mySongs.get(5));

        assertTrue(myPlaylist.isEmpty());
    }

}
