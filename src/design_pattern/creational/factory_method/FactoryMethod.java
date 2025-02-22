package design_pattern.creational.factory_method;

class ProductA implements Product {

    String name;
    int price;

    public ProductA(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void serve() {
        System.out.println("Serving Product A with price : " + price);
    }
}

class ProductB implements Product {

    String name;
    int price;

    public ProductB(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void serve() {
        System.out.println("Serving Product B with price : " + price);
    }

}


public class FactoryMethod {

    public static Product getProduct(String productType){
        return switch (productType) {
            case "A" -> new ProductA("A", 100);
            case "B" -> new ProductB("B", 200);
            default -> null;
        };
    }
}
