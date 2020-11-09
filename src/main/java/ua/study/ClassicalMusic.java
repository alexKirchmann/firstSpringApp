package ua.study;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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
