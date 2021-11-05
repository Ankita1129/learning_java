import java.util.Scanner;

//find the number of times the input digit n is repeated in the input number

public class repeated_num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        long num = input.nextLong();
        System.out.print("Enter the digit whose repetition number is reqired: ");
        long digit = input.nextLong();

        long a = num % 10;
        int count = 0;
        while (num != 0) {
            a = num % 10;
            if (a == digit) {
                count++;
                // num /= 10;
            }
            num /= 10;
        }
        System.out.println(count);
        input.close();
    }
}