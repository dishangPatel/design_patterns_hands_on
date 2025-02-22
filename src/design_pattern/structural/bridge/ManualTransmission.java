package design_pattern.structural.bridge;

public class ManualTransmission implements Transmission {

    @Override
    public void gearDown() {
        System.out.println("Manual Transmission : shift down");
    }

    @Override
    public void gearUp() {
        System.out.println("Manual Transmission : shift up");
    }

}
