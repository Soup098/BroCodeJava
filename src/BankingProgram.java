import java.util.Scanner;

public class BankingProgram {

    static Scanner scanner = new Scanner(System.in);

    public static void runBankingProgram(){

        double balance = 0;
        boolean isRunning = true;
        int choice;

        while(isRunning){

            //display menu
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. Show balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            //get and process users choice
            System.out.print("Please choose an option (1-4): ");
            choice = scanner.nextInt();


            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Choice");
            }
        }

        System.out.println("PROGRAM ENDED");

        scanner.close();
    }

    static void showBalance(double balance){
        System.out.println(" ");
        System.out.printf("Your balance is $%.2f\n", balance);
        System.out.println(" ");
    }

    static double deposit(){
        double amount;
        System.out.println(" ");
        System.out.print("Choose deposit amount: ");
        amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("Deposit cant be less than 0");
            return 0;
        }

        System.out.println(" ");
        System.out.println("Your deposit has been accepted\n");

        return amount;
    }

    static double withdraw(double balance){
        double amount;
        System.out.println(" ");
        System.out.print("Choose withdrawal amount: ");
        amount = scanner.nextDouble();

        if(amount > balance){
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        }

        System.out.println(" ");
        System.out.println("Your withdrawal has been accepted\n");

        return amount;
    }
}
