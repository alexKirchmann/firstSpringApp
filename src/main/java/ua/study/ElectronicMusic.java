package ua.study;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class ElectronicMusic implements Music {
    @Override
    public String getSong() {
        return "Claim the Game";
    }
}
