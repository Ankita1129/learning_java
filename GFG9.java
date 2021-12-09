import java.util.Scanner;

/*Given a string of length N, made up of only uppercase characters 'R' and 'G', where 'R' stands for Red and 'G' stands for Green.Find out the minimum number of characters you need to change to make the whole string of the same colour.*/

public class GFG9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String S = scanner.nextLine();
        char arr[] = S.toCharArray();
        int countR = 0, countG = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] == 'R') {
                countR++;
            }
            if (arr[i] == 'G') {
                countG++;
            }
        }
        if (countR <= countG) {
            System.out.println(countR);
        } else {
            System.out.println(countG);
        }
        scanner.close();

        // Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt(); // N == 5 e.g
        // sc.nextLine(); // Consume the leftover '\n'

        // String s = sc.nextLine(); // Hello World
        // s = s.substring(0, N);
        // System.out.println(s);
        // sc.close();
    }
}
