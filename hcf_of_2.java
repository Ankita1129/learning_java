import java.util.Scanner;

//HCF Of Two Numbers Program

public class hcf_of_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if (num1 % num2 == 0) {
            System.out.println(num2);
        }
        if (num2 % num1 == 0) {
            System.out.println(num1);
        }
        if (num1 % num2 != 0 && num2 % num1 != 0) {
            if (num2 > num1) {
                for (int i = num1 - 1; i > 0; i--) {
                    if (num1 % i == 0) {
                        if (num2 % i == 0) {
                            System.out.println(i);
                            break;
                        }
                    }
                }
            }
            if (num1 > num2) {
                for (int i = num2 - 1; i > 0; i--) {
                    if (num2 % i == 0) {
                        if (num1 % i == 0) {
                            System.out.println(i);
                            break;
                        }
                    }
                }
            }
        }
        input.close();
    }
}
