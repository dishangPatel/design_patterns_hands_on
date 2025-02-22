package design_pattern.structural.proxy;

import java.util.HashMap;


class MySqlDatabase implements Database {

    public String executeQuery(String query) {
        System.out.println("executing query " + query);
        return "Result of query " + query;
    }

}

public class DatabaseProxy implements Database {

    private final Database database;

    public DatabaseProxy() {
        this.database = new MySqlDatabase();
    }


    private final HashMap<String, String> cachedQuery = new HashMap<>();

    public String executeQuery(String query) {

        System.out.println("============");
        if (cachedQuery.containsKey(query)) {
            System.out.println("cached query found");
            return cachedQuery.get(query);
        }

        System.out.println("executing query from proxy");
        String queryResult = database.executeQuery(query);
        cachedQuery.put(query, queryResult);
        return queryResult;
    }
}



