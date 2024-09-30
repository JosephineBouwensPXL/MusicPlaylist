package be.pxl.music.service;

import be.pxl.music.domain.Song;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class MusicPlaylistService {
    private final List<Song> myPlaylist = new ArrayList<>();
    public void addSong(Song song) {
        myPlaylist.add(song);
    }
    public List<Song> getSongs() {
        return myPlaylist;
    }
}