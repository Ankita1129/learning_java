import java.util.Scanner;

//!class in class.

class trial1 {
	class complex_op {
		float real, imag;

		complex_op() { // !constructor.
			real = 0;
			imag = 0;
		}

		complex_op(float comp1, float comp2) { // !constructor.
			real = comp1;
			imag = comp2;
		}

		void add(complex_op c1, complex_op c2) { // !function.
			// float real,imag;
			this.real = (c1.real) + (c2.real);
			this.real = (c1.imag) + (c2.imag);
			System.out.println("Addition: " + this.real + "+" + this.imag + "i");
		}

	}

	public static void main(String args[]) {
		float real1, real2, imag1, imag2;
		System.out.println("Enter the real part of 1st number: ");
		Scanner sc = new Scanner(System.in);
		real1 = sc.nextInt();
		System.out.println("Enter the imaginary part of 1st number: ");
		imag1 = sc.nextInt();
		System.out.println("Enter the real part of 2nd number: ");
		real2 = sc.nextInt();
		System.out.println("Enter the imaginary part of 2nd number: ");
		imag2 = sc.nextInt();
		trial1 comp = new trial1(); // ! creating instance of outer class.
		complex_op obj1 = comp.new complex_op(real1, imag1); // !creating object of inner class using instance of outer.
		complex_op obj2 = comp.new complex_op(real2, imag2);
		obj1.add(obj1, obj2); // !calling function
		sc.close();
	}

}
