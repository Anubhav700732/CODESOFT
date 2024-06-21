import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
 class Quiz 
{
    static int score = 0;
    static char answer;
    static char[] answers = {'B', 'A', 'C', 'B', 'D'};
    static boolean answered = false;
    Quiz()
 {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Quiz Game");
        System.out.println("You have some questions to answer.");

        ask(scanner, 1, "What is the capital of India?", new String[]{"A. Mumbai", "B. New Delhi", "C. Kolkata", "D. Chennai"}, answers[0]);
        ask(scanner, 2, "What is the capital of USA?", new String[]{"A. Washington D.C.", "B. New York", "C. Los Angeles", "D. Chicago"}, answers[1]);
        ask(scanner, 3, "Who is an Indian cricketer?", new String[]{"A. Steven Smith", "B. Babar Azam", "C. Rohit Sharma", "D. Joe Root"}, answers[2]);
        ask(scanner, 4, "Where is the Taj Mahal?", new String[]{"A. Mumbai", "B. Agra", "C. Kolkata", "D. Chennai"}, answers[3]);
        ask(scanner, 5, "What is the capital of Tamil Nadu?", new String[]{"A. Mumbai", "B. New Delhi", "C. Kolkata", "D. Chennai"}, answers[4]);
        System.out.println("Your final score is: " + score);
        if (score == 500) 
{
            System.out.println("Congratulations! You have won the Game");
        } else 
{
            System.out.println("Thanks for playing. Better luck next time!");
        }
    }

    public static void ask(Scanner scanner, int q_number, String question, String[] options, char c_answer) 
{
        System.out.println("Question " + q_number + ":");
        System.out.println(question);
        for (String option : options) {
            System.out.println(option);
        }

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (!answered) {
                    System.out.println("\nTime's up!");
                  System.out.println("Your final score is: " + score);
                  System.out.println("Thanks for playing. Better luck next time!");
                     System.exit(0);
                }
            }
        }, 10000); // 10 seconds timer

        System.out.print("Enter your answer: ");
        String input = scanner.nextLine().toUpperCase();
        answered = true;
        timer.cancel();

        if (input.length() == 1 && input.charAt(0) == c_answer)
     {
            System.out.println("Correct!");
            score += 100;
        } else {
            System.out.println("Incorrect!");
           System.out.println("Your final score is: " + score);
           System.out.println("Thanks for playing. Better luck next time!");
            System.exit(0);
        }
        answered = false;
    }
}
public class Task_4
 { 

public static void main(String[] args)
{
Quiz obj=new Quiz();
}
}