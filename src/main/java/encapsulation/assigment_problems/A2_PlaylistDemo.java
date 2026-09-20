package encapsulation.assigment_problems;

import java.util.Arrays;

// Shows that editing the returned song array does not touch the playlist.
public class A2_PlaylistDemo {
    public static void main(String[] args) {
        Playlist p = new Playlist(10);
        p.addSong("Song A");
        p.addSong("Song B");

        String[] copy = p.getSongs();
        System.out.println("getSongs() -> " + Arrays.toString(copy));

        copy[0] = "Hacked";
        System.out.println("After editing copy, getSongs()[0] -> " + p.getSongs()[0]);
        System.out.println("getSongCount() -> " + p.getSongCount());
    }
}
