package task4;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);

	        // Get a number from the user
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        long factorial = 1; // Use long to handle larger results

	        // Calculate factorial
	        for (int i = 1; i <= number; i++) {
	            factorial *= i;
	        }

	        // Display result
	        System.out.println(number + "! = " + factorial);

	        scanner.close();
	    }
	
	}


