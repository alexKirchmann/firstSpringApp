package ua.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private ClassicalMusic _music1;
    private RockMusic _music2;
    @Autowired
    private ElectronicMusic _music3;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic) {
        _music1 = classicalMusic;
    }

    @Autowired
    public void setMusic(RockMusic rockMusic){
        _music2 = rockMusic;
    }

    public String playMusic() {
        return "Playing: " + _music1.getSong() + "\n" + "Playing: " + _music2.getSong() + "\n" + "Playing: " + _music3.getSong();
    }
}
