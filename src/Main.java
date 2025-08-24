
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws InterruptedException {
        //for loops

        Scanner scanner = new Scanner(System.in);
        System.out.println("Countdown start? ");
        int start = scanner.nextInt();

        for(int i  = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}
