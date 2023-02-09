
//Write a program to demonstrate the concept of function overloading of 
//Polymorphism:

package hackerrank_Solution;

class Adder {
	// Method Overloading: changing no. of arguments
	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}

	// Method Overloading: changing data type of arguments
	static double add(double a, double b) {
		return a + b;
	}

	static String add(String a, String b) {
		String str = "Four";
		return str;
	}

	// Method Overloading: Sequence of data type of arguments
	static void disp(String c, int num) {
		System.out.println(c + " " + num);
	}

	static void disp(int num, String c) {
		System.out.println(num + " " + c);
	}
}

public class TestOverloadingEx11 {

	public static void main(String[] args) {
		System.out.println(Adder.add(11, 11));
		System.out.println(Adder.add(11, 11, 11));

		// Method Overloading: changing data type of arguments
		System.out.println(Adder.add(12.3, 12.6));
		System.out.println(Adder.add("One", "Three"));
		// Method Overloading: Sequence of data type of arguments
		Adder.disp("manish", 5527);
		Adder.disp(9399, "hello");

		// TODO Auto-generated method stub

	}

}
