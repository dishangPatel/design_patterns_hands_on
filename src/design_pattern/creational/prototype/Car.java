package design_pattern.creational.prototype;

//abstract class Car implements Cloneable {
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
//}

import com.google.gson.Gson;

public class Car {

    private String name;
    private String color;
    private double price;
    private String accessories;

    public Car() {
        this.name = "ABC";
        this.color = "White";
        this.price = 100;
        this.accessories = "NA";
    }

    public static void main(String[] args) {
        Car c = new Car();
        Gson gson = new Gson();
        String jsonObj = "{\"name\":\"xca\"}"; //son.toJson(c, Car.class);
        gson.toJson(jsonObj, Car.class);
        Car c2 = gson.fromJson(jsonObj, Car.class);
        System.out.println(c2.name);
    }

}


