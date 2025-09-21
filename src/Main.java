
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

// public method - accessible from anywhere
// private method - accessible only within its class
// static method - belongs to the class, not an instance (can be called without creating an object)
// void method - does not return anything (just performs method action)


public class Main {
    public static void main(String[] args) {
        //arrays a collection of values of the same data type

        String[] fruit = {"orange", "apple", "banana", "mango"};

        Arrays.sort(fruit);
        Arrays.fill(fruit, "Avacado");

        for(String fruits : fruit){
            System.out.print(fruits + " ");
        }
    }
}

