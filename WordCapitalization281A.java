import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class WordCapitalization281A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String substr1 = str.substring(1, str.length());
        String substr2 = str.substring(0, 1);
        String cap = substr2.toUpperCase();
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < cap.length(); i++) {
            queue.add(cap.charAt(i));
        }
        for (int i = 0; i < substr1.length(); i++) {
            queue.add(substr1.charAt(i));
        }
        String ans = queue.toString();
        String answer = "";
        for (int i = 1; i < ans.length(); i = i + 3) {
            char ch = ans.charAt(i);
            answer = answer + ch;
        }
        System.out.println(answer);
        scanner.close();
    }
}
