import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter GPA: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Your name is " + name + ", and you are " + age + " years old.");
        System.out.println("Also, your gpa is: " + gpa);
        if(isStudent){
            System.out.println("Your are a student");
        }else{
            System.out.println("you are not a student");
        }



        scanner.close();//close the scanner after use


    }
}
