import java.util.Scanner;

//Use of Switch Case Statement

public class switch_case {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.next();
        switch (fruit) {
        case "Apple":
            System.out.println("Red colour🍎");
            break;
        case "Orange":
            System.out.println("Orange colour🟠");
            break;
        case "Grapes":
            System.out.println("Purple colour🍇");
            break;
        default:
            System.out.println("Unknown colour🙋");
        }
        scanner.close();
    }
}
