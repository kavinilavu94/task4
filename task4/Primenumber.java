package task4;
import java.util.Scanner;
public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        // Get a number from the user
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        boolean isPrime = true;

	        // Check if the number is less than or equal to 1
	        if (number <= 1) {
	            isPrime = false;
	        } else {
	            // Check divisibility
	            for (int i = 2; i <= Math.sqrt(number); i++) {
	                if (number % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	        }

	        // Display result
	        if (isPrime) {
	            System.out.println(number + " is a Prime number.");
	        } else {
	            System.out.println(number + " is NOT a Prime number.");
	        }

	        scanner.close();
	    }
		


}
