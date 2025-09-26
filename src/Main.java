
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

// public method - accessible from anywhere
// private method - accessible only within its class
// static method - belongs to the class, not an instance (can be called without creating an object)
// void method - does not return anything (just performs method action)


public class Main {
    public static void main(String[] args) {
        //searching arrays

        int[] numbers = {1, 9, 2, 8, 3, 5, 4};
        int target = 2;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == target){
                System.out.println("match");
            }else{
                System.out.println("no match");
            }
        }

    }
}

