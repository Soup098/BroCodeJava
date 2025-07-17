import java.util.Random;

public class Main {
    public static void main(String[] args){
//        System.out.println(Math.PI);
//        System.out.println(Math.E);

        double result;
        int power = 1;

        while(power < 25){
            result = Math.pow(2, power);
            System.out.println(result);
            power++;
        }

    }
}
