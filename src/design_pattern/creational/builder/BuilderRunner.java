package design_pattern.creational.builder;

public class BuilderRunner {

    public static void main(String[] args) {

        PizzaBuilder hawaiinPizzaBuilder = new HawaiinPizzaBuilder();
        hawaiinPizzaBuilder.servePizza();

        PizzaBuilder neoPolitanPizzaBuilder = new NeoPolitanPizzaBuilder();
        neoPolitanPizzaBuilder.servePizza();
    }
}
