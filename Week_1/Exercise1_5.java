package Week_1;

import java.util.Scanner;

public class Exercise1_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double mark_avg;
		int result;
		int i;
		int s;
		// define size of array
		s = input.nextInt();
		// The array is defined "arr" and inserted marks into it.
		int[] arr = new int[s];
		for (i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}

		int temp = 0, j;

		for (i = 0; i < s; i++) {
			for (j = 1; j < (s - i); j++) {
				if (arr[j - 1] > arr[j]) {
					// swap elements
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		result = arr[s - 1];
		temp = 0;
		for (i = 0; i < arr.length; i++) {
			temp += arr[i];
		}
		mark_avg = temp / s;

		System.out.println(result);
		System.out.print(mark_avg);

	}

}
