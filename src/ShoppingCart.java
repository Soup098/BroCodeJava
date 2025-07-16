import java.util.Scanner;

public class ShoppingCart {
    public void runShoppingCart(){
        Scanner scanner = new Scanner(System.in);

        String item;
        String formattedTotal;
        double price;
        double total;
        int quantity;
        char currency= '$';

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("What is the price per item?: ");
        price = scanner.nextDouble();

        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt();

        total = price * quantity;
        formattedTotal = String.format("%.2f", total);

        System.out.println("\nTotal cost for " + quantity + " " + item + " is " + currency + formattedTotal);

        scanner.close();
    }
}
