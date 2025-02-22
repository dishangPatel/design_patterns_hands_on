package design_pattern.structural.bridge;

abstract class Vehicle {
    protected Transmission transmission;
    public Vehicle(Transmission transmission) {
        this.transmission = transmission;
    }

    abstract public void applyTransmission(char direction);
}
