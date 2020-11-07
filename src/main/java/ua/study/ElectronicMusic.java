package ua.study;

import org.springframework.stereotype.Component;

@Component
public class ElectronicMusic implements Music {
    @Override
    public String getSong() {
        return "Claim the Game";
    }
}
