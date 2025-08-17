
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //enhanced switch
        Scanner scanner = new Scanner(System.in);
        System.out.print("type a day of the week: ");
        String day = scanner.next();

        switch(day.toLowerCase()){
            case "monday", "tuesday", "wednesday", "thursday", "friday" -> System.out.println("It is a weekday");
            case "saturday", "sunday" -> System.out.println("Weekend");
            default -> System.out.println("Not a day");
        }
    }
}
