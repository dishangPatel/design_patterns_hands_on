package design_pattern.creational.builder.computer_system;

import design_pattern.creational.builder.Pizza;

class Computer {

    String ram;
    String cpu;
    String hdd;
    String graphicCard;
    String os;

    public Computer(String ram, String cpu, String hdd, String graphicCard, String os) {
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
        this.graphicCard = graphicCard;
        this.os = os;
    }

    public String toString() {
        return "Computer built " + ram + " " + cpu + " " + hdd + " " + graphicCard + " " + os;
    }
}


class ComputerBuilder {

    String ram;
    String cpu;
    String hdd;
    String graphicCard;
    String os;


    public ComputerBuilder() {
        this.ram = "default";
        this.cpu = "default";
        this.hdd = "default";
        this.graphicCard = "default";
        this.os = "default";
    }

    public ComputerBuilder setRam(String ram) {
        this.ram = ram;
        return this;
    }

    public ComputerBuilder setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public ComputerBuilder setHdd(String hdd) {
        this.hdd = hdd;
        return this;
    }

    public ComputerBuilder setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
        return this;
    }

    public ComputerBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public Computer build() {
        return new Computer(ram, cpu, hdd, graphicCard, os);
    }
}


public class BuilderRunner {
    public static void main(String[] args) {

        ComputerBuilder computerBuilder = new ComputerBuilder();

        Computer computer = computerBuilder.setHdd("256 gb")
                .build();

        System.out.println(computer);
    }
}




