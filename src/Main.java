
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{
    static void singBirthday(String name, int age){
        System.out.printf("Happy birthday %s \n", name);
        System.out.printf("You are %d years old \n", age);
    };
    static double square(double num){
        return num * num;
    }


    public static void main(String[] args) {
        double number = 14;
        System.out.println(square(number));
    }
}

