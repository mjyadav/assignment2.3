//program to find the highest among the given 3 numbers

public class Largest { // create a class

	public static void main(String[] args) { // Main Method

		int x = 2, y = 4, z = 1; // Declaration

		if (x > y && x > z)		 // logic if condition

			System.out.println("First number is largest=" + x); // for output on
																// the screen
		else if (y > x && y > z) // else and if condition
			System.out.println("Second number is largest=" + y); // for output
																	// on the
																	// screen
		else if (z > x && z > y) // else and if condition
			System.out.println("Third number is largest=" + z); // for output on
																// the screen

	}
}
