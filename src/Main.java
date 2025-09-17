
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
    static double cube(double num){
        return num * num * num;
    }
    static String getFullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {

        String first = "Alex";
        String last = "Surprenant";

        System.out.println(getFullName(first, last));
    }
}

