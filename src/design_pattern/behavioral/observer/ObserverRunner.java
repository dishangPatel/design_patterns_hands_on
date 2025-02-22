package design_pattern.behavioral.observer;

class EventAListner implements Listner{
    public void update(String event, String message) {
        System.out.println("Updating event " + event + " with message " + message);
    }
}

class EventBListner implements Listner{
    public void update(String event, String message) {
        System.out.println("Updating event " + event + " with message " + message);
    }
}

public class ObserverRunner {
    public static void main(String[] args) {

        Publisher publisher = new EventHandler();
        Producer eventProducer = new Producer(publisher);

        Listner eventAListner = new EventAListner();
        Listner eventBListner = new EventBListner();

        publisher.subscribe("eventA", eventAListner);
        publisher.subscribe("eventB", eventBListner);

        eventProducer.thingAHappened();
        eventProducer.thingBHappened();
        eventProducer.thingBHappened();

        publisher.unsubscribe("eventA", eventAListner);

        eventProducer.thingAHappened();

    }
}
