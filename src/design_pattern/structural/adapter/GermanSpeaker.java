package design_pattern.structural.adapter;

public class GermanSpeaker {

    public GermanSpeaker() {
    }

    public void speakGerman(String message) {
        System.out.println("Speaking in german " + message);
    }
}
