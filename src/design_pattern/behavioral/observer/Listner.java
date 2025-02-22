package design_pattern.behavioral.observer;

public interface Listner {
    public void update(String event, String message);
    public void unsubEvent(String event);
}