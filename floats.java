import java.util.Scanner;

public class floats {
    public static void main(String[] args) {
        int i = 63;
        double j = i;
        System.out.println(j + " ");
        int a = 999999999;
        char b = 'A';
        long c = 54654546545464l;
        float d = 656.65f;
        boolean e = true;
        System.out.println(a + " " + b + " " + c + " " + d + " " + e);

        // byte takes modulo
        System.out.println("Enter p: ");
        Scanner p = new Scanner(System.in);
        int r = p.nextInt();
        byte x = (byte) (r);
        System.out.println(x);

        System.out.println("Enter q: ");
        Scanner q = new Scanner(System.in);
        float s = q.nextInt();
        int y = (int) (s);
        System.out.println(y);

        byte h = (byte) (x * y);
        int g = (int) (h);
        String k = "ANKITA";
        System.out.println(g + " " + k);
        System.out.println("Multiplication: " + g);
        p.close();
        q.close();
    }
}
