package design_pattern.creational.abstract_factory;

public class AbstractFactoryRunner {

    public static void main(String[] args) {

        System.out.println("Ordering from CoffeeCafe");
        Cafe cafe = new CoffeeCafe();
        cafe.serveBreakfast();

        System.out.println("Ordering from TeaCafe");
        cafe = new TeaCafe();
        cafe.serveBreakfast();

    }

}
