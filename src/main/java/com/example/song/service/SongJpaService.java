
package com.example.song.service;

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.http.HttpStatus;
 import org.springframework.stereotype.Service;
 import org.springframework.web.server.ResponseStatusException;
 import java.util.*;

 import com.example.song.model.Song;
 import com.example.song.repository.*;

@Service

 public class SongJpaService implements SongRepository{

    @Autowired

    private SongJpaRepository songjparepository;

    @Override
    public ArrayList<Song> getallSongs(){
      List<Song> Songs =  songjparepository.findAll();
      ArrayList<Song> allSongs  = new ArrayList<>(Songs);
      return allSongs;
    }

    @Override 
    public Song addNewSong(Song newSong){
      songjparepository.save(newSong);

      return newSong;
    }

    @Override
    public Song getSongById(int songId){
      try{
        Song song  = songjparepository.findById(songId).get();
        return song;
      }catch(Exception e){
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
      }
    }

    @Override
    public Song updateSongById(int songId, Song modifySong){

      try{
        Song newSong  = songjparepository.findById(songId).get();

        if (modifySong.getSongName()!=null){
          newSong.SetSongName(modifySong.getSongName());
        }
        if (modifySong.getLyricist()!=null){
          newSong.SetLyricist(modifySong.getLyricist());
        }
        if (modifySong.getSinger()!=null){
          newSong.SetSinger(modifySong.getSinger());
        }
        if (modifySong.getMusicDirector()!=null){
          newSong.SetMusicDirector(modifySong.getMusicDirector());
        }

        songjparepository.save(newSong);
        return newSong;
      }
      catch(Exception e){
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
      }
    }

    @Override
    public void deleteSongById(int songId){
      try{
        songjparepository.deleteById(songId);
      }
      catch(Exception e){
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
      }
    }

    
 }
 