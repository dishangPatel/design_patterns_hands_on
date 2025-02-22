package design_pattern.creational.abstract_factory;

class Espresso implements Drink {
    public void serve() {
        System.out.println("Espresso served");
    }
}

class Croissant implements Bread {
    public void serve() {
        System.out.println("Croissant served");
    }
}

class CoffeeCafe implements Cafe {

    @Override
    public void serveBreakfast() {
        Espresso espresso = new Espresso();
        Croissant croissant = new Croissant();
        croissant.serve();
        espresso.serve();
    }
}


