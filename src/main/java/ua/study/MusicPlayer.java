package ua.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String _name;
    @Value("${musicPlayer.volume}")
    private int _volume;

    private List<Music> _musicList;

    @Autowired
    public MusicPlayer(List<Music> musicList) {
        _musicList = musicList;
    }

    public String getName() {
        return _name;
    }

    public int getVolume() {
        return _volume;
    }

    public String playMusic() {
        int rnd = new Random().nextInt(3);
        return "Playing: " + _musicList.get(rnd).getSong();
    }
}
