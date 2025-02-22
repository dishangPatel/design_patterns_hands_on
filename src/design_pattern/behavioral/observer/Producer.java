package design_pattern.behavioral.observer;

public class Producer {

    Publisher publisher;

    public Producer(Publisher publisher){
        this.publisher = publisher;
    }

    public void thingAHappened(){
        publisher.notifyListeners("eventA","Event A Occurred in system");
    }

    public void thingBHappened(){
        publisher.notifyListeners("eventB","Event B Occurred in system");
    }

}
