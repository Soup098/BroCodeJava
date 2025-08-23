
import java.util.Scanner;

public class Main
{
    public static void main(String[] args){
        //while loops - repeat code forever while a certain condition remains true

        Scanner scanner = new Scanner(System.in);

        String name = "";

        while(name.isEmpty()){
            System.out.print("Enter name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);

        scanner.close();
    }
}
