package task4;
import java.util.Scanner;
public class SeniorCitizen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Get the person's age
        System.out.print("Enter the person's age: ");
        int age = scanner.nextInt();

        // Check if the person is a senior citizen
        if (age >= 60) {
            System.out.println("The person is a Senior Citizen.");
        } else {
            System.out.println("The person is NOT a Senior Citizen.");
        }

        scanner.close();
    }

	}


