/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shazn
 */
public class ARTIST {
    String artist_name;
    public SONG song;
    public GENRE genre;
    public ARTIST(String artist_name, String songlyrics, String genre_name){
      this.artist_name = artist_name;
      this.song = new SONG(songlyrics);
      this.genre = new GENRE(genre_name);
        
    }
    public void main_album(){
        System.out.println(artist_name + ", " + song.lyrics + ", " + genre.genre);
    }
}
