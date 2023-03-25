// Write your code here
package com.example.song.repository;

import com.example.song.model.Song;
import java.util.*;


public interface SongRepository{
    
    ArrayList<Song> getallSongs();

    Song addNewSong(Song newSong);

    Song getSongById(int songId);

    Song updateSongById(int songId, Song modifySong);

    void deleteSongById(int songId);
}