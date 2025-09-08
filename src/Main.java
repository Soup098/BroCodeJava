
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args){

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

        for (int i = 1; i < rows + 1; i++){
            System.out.print("Row " + i + ": ");
            for (int j = 1; j < columns  + 1; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }

        scanner.close();
    }
}
