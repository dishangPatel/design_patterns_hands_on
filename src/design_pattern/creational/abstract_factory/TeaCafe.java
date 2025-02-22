package design_pattern.creational.abstract_factory;


class Tea implements Drink {
    public void serve() {
        System.out.println("Tea served");
    }
}

class Bun implements Bread {
    public void serve() {
        System.out.println("Bun served");
    }
}



class TeaCafe implements Cafe {
    @Override
    public void serveBreakfast() {
        Tea tea = new Tea();
        Bun bun = new Bun();
        bun.serve();
        tea.serve();
    }
}

