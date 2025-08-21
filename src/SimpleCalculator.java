import java.util.Scanner;

public class SimpleCalculator {
    public static void runSimpleCalculator() {

        Scanner scanner = new Scanner(System.in);

        double numOne;
        double numTwo;
        char operator;
        double result = 0;
        boolean validOperation = true;

        System.out.print("Enter first number: ");
        numOne = scanner.nextDouble();
        System.out.print("Enter an operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);
        System.out.print("Enter the second number: ");
        numTwo = scanner.nextDouble();

        switch (operator){
            case '+' -> result = numOne + numTwo;
            case '-' -> result = numOne - numTwo;
            case '*' -> result = numOne * numTwo;
            case '/' -> {
                if(numTwo == 0){
                    System.out.println("Cannot divide by zero");
                    validOperation = false;
                }else{
                    result = numOne / numTwo;
                }
            }
            case '^' -> result = Math.pow(numOne, numTwo);
            default ->{
                System.out.println("Invalid operator");
                validOperation = false;
            }
        }

        if(validOperation){
            System.out.println(result);
        }

        scanner.close();
    }
}
