//1. Average of Student Marks
//
//This version simply takes input for each student’s mark, validates it, and calculates the average.


import java.util.Scanner;
public class AverageMarks {


    public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);
        int totalMarks = 0;
        
        for (int i = 1; i <= 3; i++) {
            int mark;
            while (true) {
                System.out.print("Enter the mark (0-100) for student " + i + ": ");
                mark = scanner.nextInt();
                if (mark >= 0 && mark <= 100) {
                    break;
                } else {
                    System.out.println("Invalid input, try again...");
                }
            }
            totalMarks += mark;
        }

        double average = totalMarks / 3.0;
        System.out.printf("The average is: %.2f\n", average);
        scanner.close();
    
    }
    
}
