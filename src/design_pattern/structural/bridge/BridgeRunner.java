package design_pattern.structural.bridge;


class Car extends Vehicle{

    public Car(Transmission transmission) {
        super(transmission);
    }

    @Override
    public void applyTransmission(char direction) {
        System.out.println("Apply Transmission...");

        if(direction == 'U'){
            transmission.gearUp();
        }else if(direction == 'D'){
            transmission.gearDown();
        }
    }
}


public class BridgeRunner {
    public static void main(String[] args) {

        Transmission automaticTransmission = new AutomaticTransmission();
        Transmission manualTransmission = new ManualTransmission();


        Vehicle car1 = new Car(automaticTransmission);
        Vehicle car2 = new Car(manualTransmission);

        car1.applyTransmission('U');
        car1.applyTransmission('D');

        car2.applyTransmission('U');
        car2.applyTransmission('D');
    }
}
