package design_pattern.creational.builder;

public class NeoPolitanPizzaBuilder implements PizzaBuilder{

    public NeoPolitanPizzaBuilder() {}

    Pizza bakePizza(){

        Base base = new Base("sourdough");
        Sauce sauce = new Sauce("BBQ");
        Topping topping = new Topping("paprika");

        return new NeoPolitanPizza(base, sauce, topping);
    }

    public void servePizza() {
        Pizza pizza = bakePizza();
        pizza.serve();
    }
}
