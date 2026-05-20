import java.util.Scanner;

public class OnlineExamination {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String username;
        String password;

        int score = 0;

        System.out.println("====================================");
        System.out.println("     ONLINE EXAMINATION SYSTEM      ");
        System.out.println("====================================");

        System.out.print("Enter Username: ");
        username = scanner.nextLine();

        System.out.print("Enter Password: ");
        password = scanner.nextLine();

        if (username.equals("Poojitha") && password.equals("1234")) {

            System.out.println("\nLogin Successful");
            System.out.println("Exam Started\n");

            System.out.println("Question 1:");
            System.out.println("Which language is used for Java programming?");
            System.out.println("1. Python");
            System.out.println("2. Java");
            System.out.println("3. HTML");
            System.out.println("4. CSS");

            System.out.print("Enter your answer: ");
            int answer1 = scanner.nextInt();

            if (answer1 == 2) {
                score++;
            }

            System.out.println("\nQuestion 2:");
            System.out.println("Which keyword is used to create a class in Java?");
            System.out.println("1. function");
            System.out.println("2. define");
            System.out.println("3. class");
            System.out.println("4. include");

            System.out.print("Enter your answer: ");
            int answer2 = scanner.nextInt();

            if (answer2 == 3) {
                score++;
            }

            System.out.println("\nQuestion 3:");
            System.out.println("Which symbol is used for comments in Java?");
            System.out.println("1. //");
            System.out.println("2. ##");
            System.out.println("3. <!-- -->");
            System.out.println("4. **");

            System.out.print("Enter your answer: ");
            int answer3 = scanner.nextInt();

            if (answer3 == 1) {
                score++;
            }

            System.out.println("\n====================================");
            System.out.println("            EXAM RESULT             ");
            System.out.println("====================================");

            System.out.println("Username: " + username);
            System.out.println("Your Score: " + score + " out of 3");

            if (score == 3) {

                System.out.println("Excellent Performance");

            } else if (score == 2) {

                System.out.println("Good Job");

            } else {

                System.out.println("Need More Practice");
            }

        } else {

            System.out.println("Invalid Username or Password");
        }

        scanner.close();
    }
}