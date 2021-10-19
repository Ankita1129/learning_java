import java.util.Scanner;

public class temp_conv {
    public static void main(String[] args) {

        System.out.print("Enter temperature in Celsius: ");
        Scanner input = new Scanner(System.in);
        float celsius = input.nextFloat();
        float fahrenheit = (celsius * 9 / 5) + 32; // formula for conversion
        System.out.println("Temperature in Fahrenheit is: " + fahrenheit);
        input.close();
    }
}
