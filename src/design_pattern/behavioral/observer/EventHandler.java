package design_pattern.behavioral.observer;

import java.util.*;

public class EventHandler implements Publisher {

    HashMap<String, HashSet<Listner>> subscribers;

    public EventHandler() {
        subscribers = new HashMap<>();
    }

    public boolean subscribe(String event, Listner listner) {
        if (!subscribers.containsKey(event)) {
            subscribers.put(event, new HashSet<>());
        }
        subscribers.get(event).add(listner);
        return true;
    }

    public boolean unsubscribe(String event, Listner listner) {

        if (subscribers.get(event).contains(listner)) {
            subscribers.get(event).remove(listner);
            return true;
        }
        return false;
    }

    public void notifyListeners(String eventType,String message) {
        System.out.println("Notifying subscriber for event " + eventType + " with message " + message);
        for (Listner listner : subscribers.get(eventType)) {
            listner.update(eventType, message);
        }
        System.out.println("Completed notifying subscriber for event " + eventType + " with message " + message);
    }



}
