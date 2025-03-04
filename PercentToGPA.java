import java.util.Scanner;

public class PercentToGPA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for percentage input
        System.out.print("Enter your percentage: ");
        double percentage = scanner.nextDouble();
        double gpa;

        // Determine GPA using if-else statements
        if (percentage >= 95.0) {
            gpa = 4.0;
        } else if (percentage >= 94.0) {
            gpa = 3.9;
        } else if (percentage >= 93.0) {
            gpa = 3.8;
        } else if (percentage >= 92.0) {
            gpa = 3.7;
        } else if (percentage >= 91.0) {
            gpa = 3.6;
        } else if (percentage >= 90.0) {
            gpa = 3.5;
        } else if (percentage >= 89.0) {
            gpa = 3.4;
        } else if (percentage >= 88.0) {
            gpa = 3.3;
        } else if (percentage >= 87.0) {
            gpa = 3.2;
        } else if (percentage >= 86.0) {
            gpa = 3.1;
        } else if (percentage >= 85.0) {
            gpa = 3.0;
        } else if (percentage >= 84.0) {
            gpa = 2.9;
        } else if (percentage >= 83.0) {
            gpa = 2.8;
        } else if (percentage >= 82.0) {
            gpa = 2.7;
        } else if (percentage >= 81.0) {
            gpa = 2.6;
        } else if (percentage >= 80.0) {
            gpa = 2.5;
        } else if (percentage >= 79.0) {
            gpa = 2.4;
        } else if (percentage >= 78.0) {
            gpa = 2.3;
        } else if (percentage >= 77.0) {
            gpa = 2.2;
        } else if (percentage >= 76.0) {
            gpa = 2.1;
        } else if (percentage >= 75.0) {
            gpa = 2.0;
        } else if (percentage >= 74.0) {
            gpa = 1.9;
        } else if (percentage >= 73.0) {
            gpa = 1.8;
        } else if (percentage >= 72.0) {
            gpa = 1.7;
        } else if (percentage >= 71.0) {
            gpa = 1.6;
        } else if (percentage >= 70.0) {
            gpa = 1.5;
        } else if (percentage >= 69.0) {
            gpa = 1.4;
        } else if (percentage >= 68.0) {
            gpa = 1.3;
        } else if (percentage >= 67.0) {
            gpa = 1.2;
        } else if (percentage >= 66.0) {
            gpa = 1.1;
        } else if (percentage >= 65.0) {
            gpa = 1.0;
        } else {
            gpa = 0.0;
        }

        // Output result
        System.out.println("Your GPA is: " + gpa);

        scanner.close();
    }
}

  
