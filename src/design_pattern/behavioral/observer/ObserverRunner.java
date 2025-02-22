package design_pattern.behavioral.observer;

class EventAListner implements Listner{

    private Publisher publisher;
    public EventAListner(Publisher pub) {
        pub.subscribe("eventA",this);
        pub.subscribe("eventB",this);
        this.publisher = pub;
    }

    public void unsubEvent(String event) {
        publisher.unsubscribe(event,this);
    }

    public void update(String event, String message) {
        System.out.println("Updating event " + event + " with message " + message);
    }
}

class EventBListner implements Listner{
    private Publisher publisher;

    public void update(String event, String message) {
        System.out.println("Updating event " + event + " with message " + message);
    }
    public EventBListner(Publisher pub) {
        pub.subscribe("eventB",this);
        this.publisher = pub;
    }
    public void unsubEvent(String event) {
        publisher.unsubscribe(event,this);
    }

}

public class ObserverRunner {
    public static void main(String[] args) {

        Publisher publisher = new EventHandler();
        Producer eventProducer = new Producer(publisher);

        Listner eventAListner = new EventAListner(publisher);
        Listner eventBListner = new EventBListner(publisher);

        eventProducer.thingAHappened();
        eventProducer.thingBHappened();
        eventProducer.thingBHappened();

        eventAListner.unsubEvent("eventA");
        eventProducer.thingAHappened();

    }
}
