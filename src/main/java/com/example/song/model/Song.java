/*
 * 
 * You can use the following import statements
 * 
 * import javax.persistence.*;
 * 
 */

// Write your code here

package com.example.song.model;

import javax.persistence.*;

@Entity 
@Table(name="playlist")
public class Song{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="songId")
    private int songId;

    @Column(name ="songName" )
    private String songName;

    @Column(name="lyricist")
    private String lyricist;

    @Column(name="singer")
    private String singer;

    @Column(name ="musicDirector")
    private String musicDirector;

    public Song(){}

    public Song(int songId, String songName, String lyricist, String singer, String musicDirector){
        this.songId = songId;
        this.songName = songName;
        this.lyricist = lyricist;
        this.singer = singer;
        this.musicDirector = musicDirector;
    }

    public void SetSongId(int songId){
        this.songId = songId;
    }
    public void SetSongName(String songName){
        this.songName = songName;
    }
    public void SetLyricist(String lyricist){
        this.lyricist = lyricist;
    }
    public void SetSinger(String singer){
        this.singer = singer;
    }
    public void SetMusicDirector(String musicDirector){
        this.musicDirector = musicDirector;
    }

    public int getSongId(){
        return songId;
    }

    public String getSongName(){
        return songName;
    }
    public String getLyricist(){
        return lyricist;
    }
    public String getSinger(){
        return singer;
    }
    public String getMusicDirector(){
        return musicDirector;
    }


}