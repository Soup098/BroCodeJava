
import java.util.Scanner;

public class Main
{
    public static void main(String[] args){
        double temp = 100;
        boolean isSunny = true;


        if(temp <= 90 && temp >= 70){
            System.out.println("The weather is good");
        }else if(temp > 90 && temp < 110 && !isSunny){
            System.out.println("the weather is hot and shitty");
        }
    }
}
