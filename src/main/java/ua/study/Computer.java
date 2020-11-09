package ua.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int _id;
    private MusicPlayer _musicPlayer;
    private Genre _genre;

    @Autowired
    public Computer (MusicPlayer musicPlayer) {
        _id = 1;
        _musicPlayer = musicPlayer;
        _genre = Genre.ELECTRONIC;
    }

    @Override
    public String toString( ) {
        return "Computer " + _id + " " + _musicPlayer.playMusic(_genre);
    }
}
