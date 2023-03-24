import java.util.Scanner;

interface Vehicle {
    public void Gear_change();

    public void speed_up();

    public void apply_brakes();
}

class Bicycle implements Vehicle {
    int gear, speed, brake;

    Bicycle(int gear, int brake, int speed) {
        this.gear = gear;
        this.speed = speed;
        this.brake = brake;
    }

    public void Gear_change() {
        System.out.println("Gear number is " + gear);
    }

    public void speed_up() {
        System.out.println("Speed of Bicycle is " + speed);
    }

    public void apply_brakes() {
        if (brake == 1) {
            System.out.println("Brakes Applied");
        } else {
            System.out.println("No brakes are applied");
        }
    }
}

class bike implements Vehicle {
    int gear, speed, brake;

    bike(int gear, int brake, int speed) {
        this.gear = gear;
        this.speed = speed;
        this.brake = brake;
    }

    public void Gear_change() {
        System.out.println("Gear number is " + gear);
    }

    public void speed_up() {
        System.out.println("Speed of bike is " + speed);
    }

    public void apply_brakes() {
        if (brake == 1) {
            System.out.println("Brakes Applied");
        } else {
            System.out.println("No brakes are applied");
        }
    }
}

class car implements Vehicle {
    int gear, speed, brake;

    car(int gear, int brake, int speed) {
        this.gear = gear;
        this.speed = speed;
        this.brake = brake;
    }

    public void Gear_change() {
        System.out.println("Gear number is " + gear);
    }

    public void speed_up() {
        System.out.println("Speed of car is " + speed);
    }

    public void apply_brakes() {
        if (brake == 1) {
            System.out.println("Brakes Applied");
        } else {
            System.out.println("No brakes are applied");
        }
    }
}

public class oop5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter gear: ");
        int gear = sc.nextInt();
        System.out.print("Enter brake: ");
        int brake = sc.nextInt();
        System.out.print("Enter speed: ");
        int speed = sc.nextInt();

        Vehicle A = new Bicycle(gear, brake, speed); // ! dynamic binding
        A.Gear_change();
        A.speed_up();
        A.apply_brakes();

        Vehicle B = new bike(gear, brake, speed);
        B.Gear_change();
        B.speed_up();
        B.apply_brakes();

        Vehicle C = new car(gear, brake, speed);
        C.Gear_change();
        C.speed_up();
        C.apply_brakes();

    }
}
