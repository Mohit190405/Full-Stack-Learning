package mohit;

import java.util.Scanner;

public class StudentUtilitySystem {

    // Method to calculate average
    static double average(int[] marks) {
        int sum = 0;

        for (int m : marks) {
            sum += m;
        }

        return (double) sum / marks.length;
    }

    // Method to display marks
    static void displayMarks(int[] marks) {
        System.out.println("Student Marks:");

        for (int m : marks) {
            System.out.println(m);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array
        int[] marks = {80, 85, 90, 95, 70};

        // Loops
        displayMarks(marks);

        // Method
        double avg = average(marks);

        System.out.println("Average: " + avg);

        // If-Else
        if (avg >= 90) {
            System.out.println("Grade: A");
        } else if (avg >= 75) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }

        // Switch
        System.out.print("Enter option (1=Show, 2=Average, 3=Exit): ");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                displayMarks(marks);
                break;

            case 2:
                System.out.println("Average is: " + average(marks));
                break;

            case 3:
                System.out.println("Exiting...");
                break;

            default:
                System.out.println("Invalid option");
        }

        // Break & Continue
        System.out.println("Break & Continue Demo:");

        for (int i = 1; i <= 5; i++) {

            if (i == 3)
                continue;

            if (i == 5)
                break;

            System.out.println(i);
        }

        // Try-Catch
        try {
            System.out.print("Enter a number to divide 100 by: ");
            int n = sc.nextInt();

            int result = 100 / n;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");

        } catch (Exception e) {
            System.out.println("Invalid input!");
        }

        sc.close();

        System.out.println("Program Finished Successfully.");
    }
}