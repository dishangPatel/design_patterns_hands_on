package design_pattern.creational.builder;

class Topping {
    public String name;

    public Topping(String name) {
        this.name = name;
    }

    public void add() {
        System.out.println("Topping " + name + "added");
    }

    public String toString() {
        return this.name;
    }
}

class Sauce {
    public String name;

    public Sauce(String name) {
        this.name = name;
    }

    public void add() {
        System.out.println("Sauce " + name + "added");
    }

    public String toString() {
        return this.name;
    }
}

class Base {
    public String name;

    public Base(String name) {
        this.name = name;
    }

    public void useBase() {
        System.out.println("used " + name + "base");
    }

    public String toString() {
        return this.name;
    }
}

abstract public class Pizza {
    Topping topping;
    Sauce sauce;
    Base base;
    String name;

    public Pizza(String name, Base base, Sauce sauce, Topping topping) {
        this.name = name;
        this.sauce = sauce;
        this.base = base;
        this.topping = topping;
    }

    abstract void serve();
}





