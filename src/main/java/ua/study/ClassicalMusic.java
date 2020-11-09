package ua.study;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class ClassicalMusic implements Music {

    @PostConstruct
    public void doMyInitialization(){
        System.out.println("INITIALIZING");
    }

    @PreDestroy
    public void myDestroy(){
        System.out.println("DESTROYING");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
