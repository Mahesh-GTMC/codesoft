import java.util.Scanner;
        // task 2 - by codesoft internship 
        // Student Grade Calculator in java
        // Developed by - Mahesh Antapure
public class StudentGradeCalculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hello,Enter the Number of Subjects: ");
        int numSubjects = sc.nextInt();
        int[] marks = new int[numSubjects];
        int totalMarks = 0;
        for (int i = 0; i < numSubjects; i++)
        {
            System.out.print("Enter marks obtained in each Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            totalMarks += marks[i];
        }
        double averagePercentage = (double) totalMarks / (numSubjects * 100) * 100;
        System.out.println("Your Result is Here:");
        System.out.println("Your Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        String grade = calculateGrade(averagePercentage);
        System.out.println("Grade: " + grade);
        sc.close();
    }

    public static String calculateGrade(double percentage)
    {
        if (percentage >= 90 && percentage <= 100)
        {
            return "A+";
        }
        else if (percentage >= 80)
        {
            return "A";
        }
        else if (percentage >= 70)
        {
            return "B";
        }
        else if (percentage >= 60)
        {
            return "C";
        }
        else if (percentage >= 50)
        {
            return "D";
        }
        else
        {
            return "F";
        }
    }
}