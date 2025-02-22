import design_pattern.structural.adapter.FrenchSpeaker;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        while(true){



            System.out.println("Enter subscriber id : ");
            int subscriberId = sc.nextInt();
            System.out.println("Enter producer id you want to subscribe to : ");
            int producerId =  sc.nextInt();

            if( !map.containsKey(producerId) ){
                map.put(producerId, new HashSet<>());
            }
            map.get(producerId).add(subscriberId);

            System.out.println("Current state \n"+map);

        }

    }
}