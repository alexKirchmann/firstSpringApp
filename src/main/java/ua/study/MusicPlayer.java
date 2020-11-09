package ua.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private Music _music1;
    private Music _music2;
    private final Music _music3;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1, @Qualifier("rockMusic") Music music2, @Qualifier("electronicMusic") Music _music3) {
        _music1 = music1;
        _music2 = music2;
        this._music3 = _music3;
    }

    public String playMusic(Genre genre) {
        if (genre.equals(Genre.CLASSICAL)) {
            return "Playing: " + _music1.getSong();
        } else if (genre.equals(Genre.ROCK)) {
            return "Playing: " + _music2.getSong();
        } else if (genre.equals(Genre.ELECTRONIC)) {
            return "Playing: " + _music3.getSong();
        } else return "ERROR - GENRE NOT FOUND";
    }
}
