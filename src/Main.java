
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

        Scanner scanner = new Scanner(System.in);
        String[] foods;
        int size;

        System.out.print("How many foods do you want?: ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];

        for(int i = 0; i < foods.length; i++){
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        for(String food : foods){
            System.out.print(food + " ");
        }

        scanner.close();
    }
}

