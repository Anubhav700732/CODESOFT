import java.util.Scanner;
class S_Grades 
{
  S_Grades()
 {
        Scanner scanner = new Scanner(System.in);
             // Number of subjects
        int num = 5,total = 0;
        int[] marks = new int[num];
        // Input marks for each subject
        for (int i = 0; i < num; i++) 
  {
        System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            marks[i] = scanner.nextInt();
            total += marks[i];
        }
        // Calculate average percentage
        double average = (double) total / num;
        // Calculate grade
        char grade;
        if (average >= 80) {
            grade = 'A';
        } else if (average >= 70) {
            grade = 'B';
        } else if (average >= 60) {
            grade = 'C';
        } else if (average >= 50) {
            grade = 'D';
        } else
        {
            grade = 'F';
        }
        // Display results
        System.out.println("Total Marks: " + total);
        System.out.println("Average Percentage: " + average + "%");
        System.out.println("Grade: " + grade);
    }
}
public class Task_2 
{
    public static void main(String[] args)
 {
   S_Grades obj= new S_Grades();

}
}