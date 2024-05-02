package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static ArrayList<Song> createSongs(){
        ArrayList<Song> mySongs = new ArrayList<>();
        String file = "song_information.csv";
        BufferedReader reader = null;
        String line = "";

        try{
            reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine()) != null){
                String[] row = line.split(",");
                System.out.println(row);
                mySongs.add(new Song(row[0], row[1], row[2], Integer.parseInt(row[3]), Float.parseFloat(row[4])));
                
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
    public static void main(String[] args){
        ArrayList<Song> myList = createSongs();
        if (myList.isEmpty()){
            throw new IllegalArgumentException();
        }
        for (Song song : myList){
        System.out.println(song);
    }
    }
}
