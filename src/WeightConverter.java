import java.util.Scanner;

public class WeightConverter {
    public void runWeightConverter(){
        //WEIGHT CONVERSION PROGRAM
        Scanner scanner = new Scanner(System.in);

        double weight;
        double netWeight;
        int choice;

        System.out.println("Weight conversion program");
        System.out.println("1: convert lbs to kgs");
        System.out.println("2: convert kgs to lbs");

        System.out.print("Choose an option: ");
        choice = scanner.nextInt();

        System.out.println(choice);

        if (choice == 1) {
            System.out.print("Enter a weight in lbs: ");
            weight = scanner.nextInt();
            netWeight = (weight * 0.453592);
            System.out.print("weight in kgs: ");
            System.out.printf("%.2f", netWeight);
        }else if(choice == 2){
            System.out.print("Enter a weight in kgs: ");
            weight = scanner.nextInt();
            netWeight = (weight * 2.20462);
            System.out.print("weight in lbs: ");
            System.out.printf("%.2f", netWeight);
        }else{
            System.out.println("Choice invalid");
        }

        scanner.close();
    }
}
