package ua.study;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music {
    List<String> songList = Arrays.asList("Dance Macabre", "A Touch of Evil", "Living Hell");

    @Override
    public String getSong() {
        int rnd = new Random().nextInt(2);
        return songList.get(rnd);
    }
}
