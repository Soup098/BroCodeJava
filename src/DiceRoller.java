import java.util.Random;
import java.util.Scanner;

public class DiceRoller {
    public static void runDiceRoller(){
        //DICE ROLLER PROGRAM

        //declare variables
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numDice;
        int total = 0;

        //get # of dice from user
        System.out.print("Enter number of dice to roll: ");
        numDice = scanner.nextInt();

        //check if numDice > 0
        if(numDice > 0){
            for(int i = 0; i < numDice; i++){
                //roll all dice
                int roll = random.nextInt(1, 7);
                printDie(roll);
                total += roll;
            }
            //get total
            System.out.println("Total: " + total
            );
        }else{
            System.out.println("Number of dice must be greater than zero");
        }

        //display ASCII art
        scanner.close();
    }
    static void printDie(int roll){
        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;
        String dice2 = """
                 -------
                |   ●   |
                |       |
                |   ●   |
                 -------
                """;
        String dice3 = """
                 -------
                |   ●   |
                |   ●   |
                |   ●   |
                 -------
                """;
        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;
        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;
        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;
        switch(roll){
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.print("invalid roll");
        }
    }


}
