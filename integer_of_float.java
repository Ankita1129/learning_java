import java.util.Scanner;

public class integer_of_float {
    public static void main(String[] args) {
        // typecasting
        int num = (int) (63.23f);
        System.out.println(num);
        // above thing in input format
        Scanner a = new Scanner(System.in);
        float b = a.nextFloat();
        int c = (int) (b);
        System.out.println(c);
        a.close();

        // byte takes modulo
        byte p = 20;
        int q = p * 2;
        System.out.println(q);
    }
}
