package OOP;

import java.util.Queue;
import java.util.Set;

public class MusicalJukebox {
    CDPlayer cdPlayer;
    User user;
    Set<CD> cdCollection;
    TrackSelector trackSelector;
    public MusicalJukebox(CDPlayer cdPlayer, User user, Set<CD> cdCollection, TrackSelector trackSelector){

    }
    public Song getCurrentTrack(){ return null; }
    public void processOneUser(User u) { }
}



class CD { }
class CDPlayer {
    Playlist playlist;
    CD cd;

    CDPlayer(Playlist p, CD cd){

    }
    public void playTrack(Song s){

    }
}
class Playlist {
    Song track;
    Queue<Song> queue;
    Playlist(Song track, Queue<Song> queue){

    }
    public Song getNextTrackToPlay(){
        return queue.peek();
    }
    public void queueNextTrack(Song s){ queue.add(s); }
}
class Song {
    String songName;
    byte[] audio;
}
class TrackSelector {
    Song currentSong;
    TrackSelector(Song s){ }
    void setTrack(Song s){ }
    Song getCurrentSong() {
        return this.currentSong;
    }
}
class User {
    String name;
    Long ID;
    public User(String name, long ID){

    }
    public static User addUser(String name, long ID){
        return new User(name, ID);
    }
}