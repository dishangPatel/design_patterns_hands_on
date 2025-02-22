package design_pattern.structural.decorator;

public interface Pizza {
    public int getCost();
}

class Margerita implements Pizza {

    @Override
    public int getCost() {
        return 10;
    }
}

class VeggieDelight implements Pizza {
    @Override
    public int getCost() {
        return 20;
    }
}

class ToppingDecorator implements Pizza {
    private Pizza pizza;
    public ToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
    public int getCost() {
        return pizza.getCost();
    }
}

class MushroomDecorator implements Pizza {
    private Pizza pizza;
    public MushroomDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
    public int getCost() {
        return pizza.getCost() + 1000;
    }
}

class ExtraCheeseDecorator implements Pizza {
    private Pizza pizza;
    public ExtraCheeseDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
    public int getCost() {
        return pizza.getCost() + 10000;
    }
}
