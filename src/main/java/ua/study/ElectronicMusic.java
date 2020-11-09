package ua.study;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class ElectronicMusic implements Music {
    @Override
    public String getSong() {
        return "Claim the Game";
    }
}
