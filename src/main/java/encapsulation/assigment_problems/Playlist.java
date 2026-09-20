package encapsulation.assigment_problems;

import java.util.Arrays;

// Music playlist that hands out copies of its songs so the real list stays safe.
public class Playlist {
    private final String[] songs;
    private int songCount;

    public Playlist(int maxSongs) {
        if (maxSongs <= 0) {
            throw new IllegalArgumentException("Playlist size must be positive");
        }
        songs = new String[maxSongs];
    }

    public boolean addSong(String title) {
        if (title == null || title.isBlank() || songCount == songs.length) {
            return false;
        }
        songs[songCount++] = title;
        return true;
    }

    public String[] getSongs() {
        return Arrays.copyOf(songs, songCount);
    }

    public int getSongCount() {
        return songCount;
    }
}
