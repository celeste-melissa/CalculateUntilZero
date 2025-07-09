import java.util.Scanner;

public class SumZero {
	public static void main(String args[]){
		double input;
		double sum = 0;
		// double sum;

		// Create a new scanner object
		Scanner scanner = new Scanner(System.in);

		// Write a Java program that calculates the sum of numbers entered by the user until users enters 0.
		do{
			// Prompt the user to enter a number
			System.out.print("Enter a number: ");

			// Scans for user's number
			input = scanner.nextDouble();
			sum += input;

		} while(input != 0);
		System.out.println("Sum: " + sum);
		scanner.close();
	}
}