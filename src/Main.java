import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        boolean isStudent;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter age: ");
        age = scanner.nextInt();

        System.out.println("");

        //group 1
        if(name.isEmpty()){
            System.out.println("You didnt enter your name");
        }else{
            System.out.println("Hello " + name + '!');
        }

        //group 2
        if(age >= 18 && age < 65) {
            System.out.println("You are an adult");
        }else if(age > 65){
            System.out.println("You are old");
        }else if(age < 0){
            System.out.println("You are not borned");
        }else{
            System.out.println("You are a child");
        }



        scanner.close();
    }
}
