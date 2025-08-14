
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double balance;
        double yearEndBalance = 0;
        int years;
        int monthlyInvestment;
        double growthPercent = .08;


        System.out.print("Enter initial balance: ");
        balance = scanner.nextInt();
        System.out.print("Enter number of years: ");
        years = scanner.nextInt();
        System.out.print("Enter monthly investment: ");
        monthlyInvestment = scanner.nextInt();

        for(int i = 0; i < years; i++)
        {
            yearEndBalance = (balance + (monthlyInvestment * 12)) * (growthPercent + 1);
            System.out.print("End of year " + (i + 1) + ": ");
            System.out.printf("$%.2f\n" , yearEndBalance);
            balance = yearEndBalance;
        }
    }
}
