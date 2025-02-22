package design_pattern.creational.builder;

public class NeoPolitanPizza extends Pizza {

    public NeoPolitanPizza(Base base, Sauce sauce, Topping topping) {
        super("NeoPolitanPizza", base, sauce, topping);
    }

    public void serve() {
        System.out.println("Serving " + name + " pizza with " + base.toString() + "base and " + sauce.toString() + " sauce and " + topping.toString() + " on top");
    }
}


