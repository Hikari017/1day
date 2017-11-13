import java.util.Random;

public class Casting {
    public static void main(String[] args) {
        float number1 = 132;
        double number2 = number1;

        double number3 = 1232311231.123241524123241241231213213;
        float number4 = (float) number3;

        int number5 = 123;
        long number6 = number5;


        long number7 = 1232151214123213124L;
        int number8 = (int) number7;


        String someString = "52424";
        int someInt = Integer.parseInt(someString);

        int someInt1 = 134;
        String someString1 = String.valueOf(someInt1);

        System.out.println(someString1);

    }
}
