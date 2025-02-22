package design_pattern.structural.decorator;

public class DecoratorRunner {
    public static void main(String[] args) {

        Pizza pizza = new ExtraCheeseDecorator(new ExtraCheeseDecorator(new VeggieDelight()));

        System.out.println("with cheese "+pizza.getCost());

    }
}
