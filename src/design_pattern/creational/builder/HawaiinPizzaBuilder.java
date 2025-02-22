package design_pattern.creational.builder;

class HawaiinPizza extends Pizza {

    public HawaiinPizza(Base base, Sauce sauce, Topping topping) {
        super("HawaiinPizza", base, sauce, topping);
    }

    public void serve() {
        System.out.println("Serving " + name + " pizza with " + base.toString() + "base and " + sauce.toString() + " sauce and " + topping.toString() + " on top");
    }
}


public class HawaiinPizzaBuilder implements PizzaBuilder {

    public HawaiinPizzaBuilder() {}

    Pizza bakePizza(){

        Base base = new Base("Thin-crust");
        Sauce sauce = new Sauce("Perry-perry");
        Topping topping = new Topping("Pineapple");

        return new HawaiinPizza(base, sauce, topping);
    }

    public void servePizza() {
        Pizza pizza = bakePizza();
        pizza.serve();
    }
}
