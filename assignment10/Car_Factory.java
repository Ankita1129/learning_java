package assignment10;

import java.util.Scanner;

abstract class Car_Factory {
    // declaration of data member
    String company, car_name;
    double budget;

    // declaration of abstract methods
    abstract void getprice(double price);

    abstract void detail(String company_name, String car_name);

    abstract void accessories();

    // declaration and implentation of input method
    void input() {
        Scanner scan = new Scanner(System.in);// creating object of scanner class
        System.out.print("Company- ");
        company = scan.next();// taking input from user
        System.out.print("Car- ");
        car_name = scan.next();// taking input from user
        System.out.print("Rough Budget(in Lakhs)- ");
        budget = scan.nextDouble();// taking input from user
    }

    void display(Car_Factory obj1) {
        // calling the methods//
        obj1.getprice(budget);// calling getprice method
        System.out.println("\n-----------------------------------");
        obj1.detail(company, car_name);// calling detail method
        System.out.println("\n-----------------------------------");
        obj1.accessories();// calling accessories method
        System.out.println("\n-----------------------------------");
    }
}