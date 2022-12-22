import java.util.Scanner;

abstract class shape {
    double length, breadth, height, base;

    abstract void compute_area();
}

class triangle extends shape {
    double area;

    void compute_area() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of the triangle: ");
        base = sc.nextDouble();
        System.out.println("Enter the height of the triangle: ");
        height = sc.nextDouble();
        System.out.println("Area of Triangle: " + (0.5 * base * height));
    }
}

class rectangle extends shape {
    double area;

    void compute_area() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        length = sc.nextDouble();
        System.out.println("Enter the breadth of the rectangle: ");
        breadth = sc.nextDouble();
        System.out.println("Area of Triangle: " + (0.5 * length * breadth));
    }
}

class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        shape s1 = new triangle();
        shape s2 = new rectangle();

        int i = 0;

        do {
            System.out.println("Calculate area of:\n1.Triangle.\n2.Rectangle.\n3.EXIT.\n");
            System.out.println("Enter your choice:");
            i = sc.nextInt();
            switch (i) {
                case 1:
                    s1.compute_area();
                    break;
                case 2:
                    s2.compute_area();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Enter valid number.");
            }
        } while (i <= 2);

    }
}
