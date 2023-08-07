package Week_1;

import java.util.Scanner;

public class Exercise1_1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double radius = s.nextDouble();
		double perimeter;
		double area;

		// Calculate the perimeter
		if (0 < radius) {
			perimeter = 2 * Math.PI * radius;
			System.out.println(perimeter);
			// Calculate the area
			area = Math.PI * radius * radius;
			System.out.print(area);
		} else
			System.out.println("Plese enter non zero positive number");

	}

}
