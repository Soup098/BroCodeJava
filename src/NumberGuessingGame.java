import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void runNumberGuessingGame(){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max+1);

        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d - %d\n", min, max);

        do{
            System.out.print("Guess a number: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("Too low");
            }else if(guess > randomNumber){
                System.out.println("Too high");
            }else{
                System.out.println("Number of attempts: " + attempts);
            }

        }while(guess != randomNumber);

        System.out.println("You win!");

        scanner.close();
    }
}
