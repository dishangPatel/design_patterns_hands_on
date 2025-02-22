import design_pattern.structural.proxy.Database;
import design_pattern.structural.proxy.DatabaseProxy;


public class Main {
    public static void main(String[] args) {

        Database database = new DatabaseProxy();

        System.out.println(database.executeQuery("select * from FrenchSpeaker"));
        System.out.println(database.executeQuery("select * from FrenchSpeaker"));
        System.out.println(database.executeQuery("select * from French"));

    }
}