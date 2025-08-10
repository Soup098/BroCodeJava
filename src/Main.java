
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // .substring() = a method used to extract a portion of a string
        String email;
        String userName;
        String domain;

        System.out.println("Please enter email");
        email = scanner.nextLine();

        if(email.contains("@")){
            userName = email.substring(0, email.indexOf('@'));
            domain = email.substring(email.indexOf('@')+1);

            System.out.println("Your username is " + userName);
            System.out.println("The email domain is " + domain);
        }else{
            System.out.println("Invalid email");
        }
        scanner.close();
    }
}
