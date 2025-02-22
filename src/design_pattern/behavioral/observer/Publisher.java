package design_pattern.behavioral.observer;
import java.util.HashMap;

public interface Publisher {
    public void notifyListeners(String eventType, String message);
    public boolean subscribe(String event, Listner listner);
    public boolean unsubscribe(String event, Listner listner);
}
