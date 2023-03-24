package assignment10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// creating object of scanner class
        // int ch;
        // double price;
        Car_Factory obj;// object of reference Car_Factory
        while (true) {
            // menu driven
            System.out.println("Which Car you want to See?- ");
            System.out.println("\n\t1.Small Car\n\t2.Sedan Car\n\t3.LuxaryCar\n\t4.Exit");

            int ch = scan.nextInt();// taking input from user
            System.out.println();
            // switch case
            switch (ch) {
                case 1:
                    obj = new Small_car(); // creating object of Small_car
                    obj.input();// calling input method
                    obj.display(obj);// calling display method
                    break;
                case 2:
                    obj = new Sedan();// creating object of Sedan
                    obj.input();// calling input method
                    obj.display(obj);// calling display method
                    break;
                case 3:
                    obj = new Luxary();// creating object of Luxary
                    obj.input();// calling input method
                    obj.display(obj);// calling display method
                    break;
                case 4:
                    System.out.println("\n-----------------------------------");
                    return;// stop execution of program
                default:
                    System.out.println("INVALID CHOICE!!");// default
                    System.out.println("\n-----------------------------------");
                    break;
            }
        }
    }
}
