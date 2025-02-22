package design_pattern.behavioral.observer;

public interface Publisher {
    void notifyListeners(String eventType, String message);
    boolean subscribe(String event, Listner listner);
    boolean unsubscribe(String event, Listner listner);
}
