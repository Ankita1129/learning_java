import java.util.Scanner;

public class matrix_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0, y = 0;
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                int a = scanner.nextInt();
                if (a == 1) {
                    x = i;
                    y = j;
                }
            }
        }

        // System.out.println(x + " " + y);

        int count = 0;
        while (true) {
            if (x == 3) {
                count = 0;
                break;
            } else if (x + 2 == 3 || x - 2 == 3) {
                count = 2;
                break;
            } else if (x + 1 == 3 || x - 1 == 3) {
                count = 1;
                break;
            }
        }
        while (true) {
            if (y == 3) {
                count = count + 0;
                break;
            } else if (y + 2 == 3 || y - 2 == 3) {
                count = count + 2;
                break;
            } else if (y + 1 == 3 || y - 1 == 3) {
                count = count + 1;
                break;
            }
        }
        System.out.println(count);
        scanner.close();
    }
}
