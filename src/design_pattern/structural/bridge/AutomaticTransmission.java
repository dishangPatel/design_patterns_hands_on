package design_pattern.structural.bridge;

public class AutomaticTransmission implements Transmission {
    @Override
    public void gearDown() {
        System.out.println("Automatic Transmission : shift down");
    }

    @Override
    public void gearUp() {
        System.out.println("Automatic Transmission : shift up");
    }
}
