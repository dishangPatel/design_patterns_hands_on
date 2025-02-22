package design_pattern.structural.facade;

public class FacadeRunner {
    public static void main(String[] args) {

        Facade facade = new Facade();

        facade.someComplexTask1();
        System.out.println("_______");
        facade.someComplexTask2();
    }
}
