package ua.study;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music {
    List<String> songList = Arrays.asList("Hungarian Rhapsody", "Du bist die Ruh", "Nocturne in B-flat minor");

    @Override
    public String getSong() {
        int rnd = new Random().nextInt(2);
        return songList.get(rnd);
    }
}
