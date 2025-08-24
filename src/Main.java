
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        char symbol;
        System.out.print("How many rows?:  ");
        rows = scanner.nextInt();
        System.out.print("How many columns?: ");
        columns = scanner.nextInt();
        System.out.print("what symbol?: ");
        symbol = scanner.next().charAt(0);

        for (int i = columns; i < columns + 1; i++){
            for (int j = rows; j < rows  + 1; j++){
                System.out.println(symbol);
            }
            System.out.println();
        }


    }
}
