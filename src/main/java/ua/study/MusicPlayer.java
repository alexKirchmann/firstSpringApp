package ua.study;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private String _name;
    private List<Music> _musicList = new ArrayList<>();
    private int _volume;



    public MusicPlayer(){}

    public MusicPlayer(List<Music> musicList) {
        _musicList = musicList;
    }

    public String getName() {
        return _name;
    }

    public List<Music> getMusicList() {
        return _musicList;
    }

    public int getVolume() {
        return _volume;
    }

    public void setName(String name) {
        _name = name;
    }

    public void setMusicList(List<Music> musicList) {
        _musicList = musicList;
    }

    public void setVolume(int volume) {
        _volume = volume;
    }



    public void playMusic() {
        for (int i = 0; i < _musicList.size(); i++){
            System.out.println("Playing: " + _musicList.get(i).getSong());
        }
    }

}
