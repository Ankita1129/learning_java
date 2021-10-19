import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
        System.out.print("Enter Principal value: ");
        Scanner a = new Scanner(System.in);
        float principal = a.nextFloat();

        System.out.print("Enter rate: ");
        Scanner b = new Scanner(System.in);
        float rate = b.nextFloat();

        System.out.print("Enter time period in year: ");
        Scanner c = new Scanner(System.in);
        float time = c.nextFloat();

        float SI = principal * (1 + rate * time);
        System.out.print("Simple Interest: " + SI);
        a.close();
        b.close();
        c.close();
    }
}
