package tests;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import main.Song;

public class PlaylistTest {
    
        public ArrayList<Song> createSongs(String[] args){
        ArrayList<Song> mySongs = new ArrayList<>();
        String file = "song_information.csv";
        BufferedReader reader = null;
        String line = "";

        try{
            reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine()) != null){
                String[] row = line.split(",");

                for(int i = 5; i < row.length; i+=5){
                    mySongs.add(new Song(row[i], row[i+1], row[i+2], Integer.parseInt(row[i+3]), Float.parseFloat(row[i+4])));
                }
                
            }
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try {
                reader.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return mySongs;
    }
}
