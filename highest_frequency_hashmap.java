import java.util.HashMap;
import java.util.Scanner;

public class highest_frequency_hashmap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        HashMap<Character, Integer> hashmap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (hashmap.containsKey(ch)) {
                int freq = hashmap.get(ch);
                int newfreq = freq + 1;
                hashmap.put(ch, newfreq);
            } else {
                hashmap.put(ch, 1);
            }
        }
        int maxfreq = hashmap.get(str.charAt(0));
        char maxfreqchar = str.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (hashmap.get(str.charAt(i)) > maxfreq) {
                maxfreq = hashmap.get(str.charAt(i));
                maxfreqchar = str.charAt(i);
            }
        }
        System.out.println(maxfreq + " " + maxfreqchar);
        scanner.close();
    }

}
