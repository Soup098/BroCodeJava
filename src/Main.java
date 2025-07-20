import java.util.Random;

public class Main {
    public static void main(String[] args){

        boolean isStudent = false;
        boolean isSenior = false;
        double price = 10;

        if(isStudent){
            if(isSenior){
                System.out.println("You get a senior discount of 20%, and a student discount of 10%");
                price *= 0.7;
            }else{
                System.out.println("You get a student discount of 10%");
                price *= 0.9;
            }
        }else{
            if(isSenior){
                System.out.println("Your get a senior discount of 20%");
                price *= 0.8;
            }
        }

        System.out.printf("The price of the ticket is $%.2f", price);
    }
}
