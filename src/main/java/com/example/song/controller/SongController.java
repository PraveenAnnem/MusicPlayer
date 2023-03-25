/*
 * 
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 *
 */

// Write your code here
package com.example.song.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

import com.example.song.service.*;
import com.example.song.model.Song;

@RestController

public class SongController{

    @Autowired 

    public SongJpaService songservice;

    @GetMapping("/songs")
    public ArrayList<Song> getAllSongs(){
        return songservice.getallSongs();
    }

    @PostMapping("/songs")

    public Song addNewSong(@RequestBody Song newSong){
        return songservice.addNewSong(newSong);
    }

    @GetMapping("/songs/{songId}")
    public Song getSongById(@PathVariable("songId")int songId){

        return songservice.getSongById(songId);
    }

    @PutMapping("/songs/{songId}")

    public Song updateSongById(@PathVariable("songId")int songId,@RequestBody Song modifySong){
        return songservice.updateSongById(songId, modifySong);
    }

    @DeleteMapping("/songs/{songId}")

    public void deleteSongById(@PathVariable("songId")int songId){
         songservice.deleteSongById(songId);
    }

    
}