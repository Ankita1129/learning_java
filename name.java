import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner a = new Scanner(System.in);
        String name = a.nextLine();
        System.out.print("Hey " + name + "!!!");
        a.close();
    }

}
