import java.util.HashMap;
import java.util.Set;

public class intro_hashmap {
    public static void main(String[] args) {

        // Creating a hashmap
        HashMap<String, Integer> hm = new HashMap<>();

        // Use of _____.put("____",____) fxn at beginning to add data
        hm.put("India", 135); // ("KEY",value)
        hm.put("China", 200);
        hm.put("Pakistan", 100);
        hm.put("USA", 25);
        hm.put("UK", 10);

        System.out.println(hm);

        // Use of ___.put() to add data or to change it later
        hm.put("India", 180); // changed
        hm.put("Africa", 15); // added

        System.out.println(hm);

        // Use of _____.get("____")
        System.out.println(hm.get("India"));
        System.out.println(hm.get("Venezuela"));

        // Use of ____,containsKey("_____")
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Australia"));

        // To print all keys
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        // To print all keys with their corresponding values
        for (String key : keys) {
            Integer value = hm.get(key);
            System.out.println(key + " : " + value);
        }
    }
}
