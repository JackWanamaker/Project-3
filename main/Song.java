package main;

public class Song {
    private String artistName;
    private String songName;
    private String albumName;
    private int releaseYear;

    public Song(String artistName, String songName, String albumName, int releaseYear){
        this.artistName = artistName;
        this.songName = songName;
        this.albumName = albumName;
        this.releaseYear = releaseYear;
    }

    public String getArtist(){
        return this.artistName;
    }

    public String getSong(){
        return this.songName;
    }

    public String getAlbum(){
        return this.albumName;
    }

    public int getReleaseYear(){
        return this.releaseYear;
    }

    
}
