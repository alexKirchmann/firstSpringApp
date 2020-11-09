package ua.study;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class ElectronicMusic implements Music {
    List<String> songList = Arrays.asList("Claim the Game", "Numbers", "Verdis Quo");

    @Override
    public String getSong() {
        int rnd = new Random().nextInt(3);
        return songList.get(rnd);
    }
}
