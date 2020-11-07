package ua.study;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);

        boolean comprasion = musicPlayer1 == musicPlayer2;

        System.out.println(comprasion);

        System.out.println(musicPlayer1);
        System.out.println(musicPlayer2);

        musicPlayer1.setVolume(10);

        System.out.println(musicPlayer1.getVolume()+"\n"+musicPlayer2.getVolume());

        musicPlayer1.playMusic();
        musicPlayer2.playMusic();

        context.close();
    }
}
