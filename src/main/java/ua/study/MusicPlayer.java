package ua.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String _name;
    @Value("${musicPlayer.volume}")
    private int _volume;

    @Autowired
    @Qualifier("electronicMusic")
    private Music _music1;
    @Autowired
    @Qualifier("rockMusic")
    private Music _music2;

    @Autowired
    public MusicPlayer(@Qualifier("electronicMusic") Music music1, @Qualifier("rockMusic") Music music2) {
        _music1 = music1;
        _music2 = music2;
    }

    public String getName() {
        return _name;
    }

    public int getVolume() {
        return _volume;
    }

    public String playMusic() {
        return "Playing: " + _music1.getSong() + "\n" + "Playing: " + _music2.getSong();
    }
}
