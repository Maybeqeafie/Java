package dz.algeev.music;

import java.util.ArrayList;

public class Album {
    public String nameA;
    public String nameT;
    public ArrayList<Music> tracks = new ArrayList<Music>();


    public Album(String nameT, String nameA){
        this.nameT = nameT;
        this.nameA = nameA;
    }
    public String toString(){
        return nameT;
    }
    public void addTrack(Music track){
        tracks.add(track);

        track.setAlbum(this);
    }
    public String showTracks(){
        String text = "";
        for (Music con : tracks) {
            text += con.toString() + "; ";
        }
        return text;
    }
}
