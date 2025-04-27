package task4;
import java.util.Scanner;
public class SwapTwoNumers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner scanner = new Scanner(System.in);

        // Getting two numbers from the user
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        // Display numbers before swapping
        System.out.println("\nBefore Swapping:");
        System.out.println("First number: " + number1);
        System.out.println("Second number: " + number2);

        // Swapping using an additional variable
        int temp = number1;
        number1 = number2;
        number2 = temp;

        // Display numbers after swapping
        System.out.println("\nAfter Swapping:");
        System.out.println("First number: " + number1);
        System.out.println("Second number: " + number2);

        scanner.close();
    
}
	}


