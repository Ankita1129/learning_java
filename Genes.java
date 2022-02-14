import java.util.Scanner;

public class Genes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if (str.charAt(0) == 'R' || str.charAt(2) == 'R') {
            System.out.println("R");
        } else if (str.charAt(0) == 'B' || str.charAt(2) == 'B') {
            System.out.println("B");
        }
        sc.close();
    }
}
