import java.util.Scanner;

//Using Nested Switch statement

public class nested_switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String line = scanner.next();
        switch (a) {
        case 1:
            System.out.println("Say");
            break;
        case 2:
            System.out.println("Read");
            break;
        case 3:
            System.out.println("3rd case:");
            switch (line) {
            case "Aloud":
                System.out.println("book📖");
                break;
            case "Write":
                System.out.println("pen🖊️");
                break;
            default:
                System.out.println("Invalid input.");
            }
            break;
        default:
            System.out.println("Invalid input.");
        }
        scanner.close();
    }
}
