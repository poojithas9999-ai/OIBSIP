import java.util.Scanner;

public class ATMInterface {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double balance = 1000.0;
        int choice;

        System.out.println("================================");
        System.out.println("     WELCOME TO POOJITHA ATM    ");
        System.out.println("================================");

        do {

            System.out.println("\nATM MENU");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:

                    System.out.println("Current Balance: Rs." + balance);
                    break;

                case 2:

                    System.out.print("Enter deposit amount: Rs.");
                    double deposit = scanner.nextDouble();

                    if (deposit > 0) {

                        balance = balance + deposit;

                        System.out.println("Money Deposited Successfully");
                        System.out.println("Updated Balance: Rs." + balance);

                    } else {

                        System.out.println("Invalid Amount");
                    }

                    break;

                case 3:

                    System.out.print("Enter withdrawal amount: Rs.");
                    double withdraw = scanner.nextDouble();

                    if (withdraw > 0 && withdraw <= balance) {

                        balance = balance - withdraw;

                        System.out.println("Money Withdrawn Successfully");
                        System.out.println("Remaining Balance: Rs." + balance);

                    } else if (withdraw > balance) {

                        System.out.println("Insufficient Balance");

                    } else {

                        System.out.println("Invalid Amount");
                    }

                    break;

                case 4:

                    System.out.println("Thank You For Using Poojitha ATM");
                    break;

                default:

                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);

        scanner.close();
    }
}
