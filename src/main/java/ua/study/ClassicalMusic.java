package ua.study;

public class ClassicalMusic implements Music {

    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }
    private void doMyInit() {
        System.out.println("INITIALIZING");
    }

    private void doMyDestroy() {
        System.out.println("DESTROYING");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
