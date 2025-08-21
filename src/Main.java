
import java.util.Scanner;

public class Main
{
    public static void main(String[] args){
        double temp = 31;

        if(temp <= 30 && temp >= 0){
            System.out.println("The weather is good");
        }else if(temp > 30 && temp < 35){
            System.out.println("the weather is big");
        }
    }
}
