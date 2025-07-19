import java.util.Random;

public class Main {
    public static void main(String[] args){
        //us printf to format output
        //%[flags][width][.precision][specifier-character]

        //[flags]
        //+ = output plus
        //, = comma grouping separator
        //( = negative numbers are enclosed in ()
        //space = display a minus if negative, space if positive

        //[width]
        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        String name = "Spongebob";    //%s
        char firstLetter = 's';       //%c
        int age = 10;                 //%d
        double height = 60.5;         //%f
        boolean isEmployed = true;    //%b

        double price1 = 9000.99;
        double price2 = 10000.15;
        double price3 = -5400.01;

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%d\n",id1);
        System.out.printf("%d\n",id2);
        System.out.printf("%d\n",id3);
        System.out.printf("%d\n",id4);

//        System.out.printf("%.2f\n", price1);
//        System.out.printf("%.2f\n", price2);
//        System.out.printf("%.2f\n", price3);

//        System.out.printf("Hello %s\n", name);
//        System.out.printf("Your name starts with %c\n", firstLetter);
//        System.out.printf("Your are %d years old\n", age);
//        System.out.printf("you are %f inches tall\n", height);
//        System.out.printf("Employed: %b\n", isEmployed);
//
//        System.out.printf("%s, is %d years old", name, age);
    }
}
