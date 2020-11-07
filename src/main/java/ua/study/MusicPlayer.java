package ua.study;

public class MusicPlayer {
    private Music _music;

    public MusicPlayer(Music music) {
        this._music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + _music.getSong());
    }
}
