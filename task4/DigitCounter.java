package task4;
import java.util.Scanner;

public class DigitCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Get the number from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int count = 0;
        int temp = Math.abs(number); // To handle negative numbers

        // Special case for 0
        if (temp == 0) {
            count = 1;
        } else {
            while (temp > 0) {
                temp /= 10; // Remove the last digit
                count++;
            }
        }

        // Print the number of digits
        System.out.println("The number of digits in " + number + " is: " + count);

        scanner.close();
    }


	}


